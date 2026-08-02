package ru.CryptoPro.CAdES.tools.verifier;

import defpackage.ljj;
import defpackage.mjj;
import defpackage.u2;
import defpackage.xr1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.DigestOutputStream;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Hashtable;
import org.bouncycastle.operator.OperatorCreationException;
import ru.CryptoPro.AdES.tools.AdESUtility;
import ru.CryptoPro.JCP.tools.AlgorithmUtility;

/* loaded from: classes4.dex */
public class GostDigestCalculatorProvider implements mjj {
    public String a;
    public String b;
    public final boolean c;
    public final boolean w;
    public final Hashtable x;

    /* renamed from: ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider$1NullOutputStream, reason: invalid class name */
    class C1NullOutputStream extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    public GostDigestCalculatorProvider(Key key, String str, boolean z, boolean z2) {
        this.b = null;
        this.x = new Hashtable();
        if (key != null) {
            this.b = AlgorithmUtility.keyAlgToDigestOid(key.getAlgorithm());
        }
        this.a = str;
        this.c = z;
        this.w = z2;
        String str2 = this.b;
        if (str2 != null) {
            this.a = AdESUtility.correctProviderByHashAlgorithm(str, str2);
        }
    }

    @Override // defpackage.mjj
    public ljj get(xr1 xr1Var) throws OperatorCreationException {
        String str;
        final OutputStream digestOutputStream;
        if (xr1Var != null) {
            try {
                u2 u2Var = xr1Var.a;
                if (u2Var != null && (str = u2Var.a) != null) {
                    this.b = str;
                }
            } catch (Exception e) {
                throw new OperatorCreationException(e.getMessage(), e);
            }
        }
        String str2 = this.b;
        if (str2 != null) {
            this.a = AdESUtility.correctProviderByHashAlgorithm(this.a, str2);
        }
        final xr1 xr1Var2 = new xr1(new u2(this.b), xr1Var != null ? xr1Var.b : null);
        if (this.c) {
            digestOutputStream = new ByteArrayOutputStream();
        } else {
            String str3 = this.a;
            String str4 = this.b;
            digestOutputStream = new DigestOutputStream(new C1NullOutputStream(), str3 == null ? MessageDigest.getInstance(str4) : MessageDigest.getInstance(str4, str3));
        }
        return new ljj() { // from class: ru.CryptoPro.CAdES.tools.verifier.GostDigestCalculatorProvider.1
            @Override // defpackage.ljj
            public xr1 getAlgorithmIdentifier() {
                return xr1Var2;
            }

            @Override // defpackage.ljj
            public byte[] getDigest() {
                String str5 = getAlgorithmIdentifier().a.a;
                GostDigestCalculatorProvider gostDigestCalculatorProvider = GostDigestCalculatorProvider.this;
                Hashtable hashtable = gostDigestCalculatorProvider.x;
                if (hashtable.containsKey(str5)) {
                    return (byte[]) hashtable.get(str5);
                }
                boolean z = gostDigestCalculatorProvider.c;
                OutputStream outputStream = digestOutputStream;
                byte[] byteArray = z ? ((ByteArrayOutputStream) outputStream).toByteArray() : ((DigestOutputStream) outputStream).getMessageDigest().digest();
                if (gostDigestCalculatorProvider.w) {
                    hashtable.put(str5, byteArray);
                }
                return byteArray;
            }

            @Override // defpackage.ljj
            public OutputStream getOutputStream() {
                return digestOutputStream;
            }
        };
    }

    public byte[] getDigest(String str) {
        return (byte[]) this.x.get(str);
    }

    public GostDigestCalculatorProvider(Key key, String str, boolean z) {
        this(key, str, z, true);
    }

    public GostDigestCalculatorProvider(Key key, String str) {
        this(key, str, false);
    }
}
