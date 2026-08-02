package ru.CryptoPro.CAdES.envelope;

import ru.CryptoPro.AdES.AdESOptions;
import ru.CryptoPro.AdES.CSPEncryptionOptions;

/* loaded from: classes4.dex */
public class EnvelopedOptions implements AdESOptions {
    public final CSPEncryptionOptions a = new CSPEncryptionOptions(this);

    public CSPEncryptionOptions<EnvelopedOptions> csp() {
        return this.a;
    }
}
