package ru.CryptoPro.reprov.x509;

import ru.CryptoPro.JCP.tools.Array;

/* loaded from: classes4.dex */
class UnparseableExtension extends Extension {
    private String name;
    private Throwable why;

    public UnparseableExtension(Extension extension, Throwable th) {
        super(extension);
        this.name = "";
        try {
            Class cls = OIDMap.getClass(extension.getExtensionId());
            if (cls != null) {
                this.name = ((String) cls.getDeclaredField("NAME").get(null)) + " ";
            }
        } catch (Exception unused) {
        }
        this.why = th;
    }

    @Override // ru.CryptoPro.reprov.x509.Extension, ru.CryptoPro.reprov.x509.CertAttrSet
    public String toString() {
        return super.toString() + "Unparseable " + this.name + "extension due to\n" + this.why + "\n\n" + Array.toHexString(getExtensionValue());
    }
}
