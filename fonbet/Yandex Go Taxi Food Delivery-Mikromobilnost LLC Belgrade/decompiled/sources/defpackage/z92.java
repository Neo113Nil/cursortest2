package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes.dex */
public final class z92 {
    public Context a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public aa2 e = null;
    public jjx f = null;
    public yvi0 g;

    public final synchronized au50 a() {
        yvi0 yvi0Var;
        au50 au50Var;
        try {
            if (this.b == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (au50.c) {
                Context context = this.a;
                String str = this.b;
                String str2 = this.c;
                byte[] bArr = null;
                if (str != null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                        if (string != null) {
                            bArr = s8o.i(string);
                        }
                    } catch (ClassCastException | IllegalArgumentException unused) {
                        throw new CharConversionException(oyr.p("can't read keyset; the pref value ", str, " is not a valid hex string"));
                    }
                } else {
                    ny61.g("keysetName cannot be null");
                }
                String str3 = this.d;
                if (bArr == null) {
                    if (str3 != null) {
                        this.e = c();
                    }
                    this.g = b();
                } else if (str3 != null) {
                    try {
                        this.e = new ba2().c(this.d);
                        try {
                            yvi0Var = new yvi0((flx) ((ilx) jb7.u(new cot(8, new ByteArrayInputStream(bArr)), this.e).b).u());
                        } catch (IOException | GeneralSecurityException e) {
                            try {
                                yvi0Var = new yvi0((flx) ((ilx) rmb1.f(new cot(8, new ByteArrayInputStream(bArr))).b).u());
                            } catch (IOException unused2) {
                                throw e;
                            }
                        }
                    } catch (GeneralSecurityException | ProviderException e2) {
                        try {
                            yvi0Var = new yvi0((flx) ((ilx) rmb1.f(new cot(8, new ByteArrayInputStream(bArr))).b).u());
                        } catch (IOException unused3) {
                            throw e2;
                        }
                    }
                    this.g = yvi0Var;
                } else {
                    this.g = new yvi0((flx) ((ilx) rmb1.f(new cot(8, new ByteArrayInputStream(bArr))).b).u());
                }
                au50Var = new au50(this);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
        }
        return au50Var;
    }

    public final yvi0 b() {
        if (this.f == null) {
            kbs.v("cannot read or generate keyset");
            return null;
        }
        yvi0 yvi0Var = new yvi0(ilx.D());
        jjx jjxVar = this.f;
        synchronized (yvi0Var) {
            yvi0Var.l(jjxVar.a);
        }
        int B = qw21.a((ilx) yvi0Var.t().b).z().B();
        synchronized (yvi0Var) {
            for (int i = 0; i < ((ilx) ((flx) yvi0Var.a).b).A(); i++) {
                try {
                    hlx z = ((ilx) ((flx) yvi0Var.a).b).z(i);
                    if (z.C() == B) {
                        if (!z.E().equals(KeyStatusType.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + B);
                        }
                        flx flxVar = (flx) yvi0Var.a;
                        flxVar.e();
                        ilx.x((ilx) flxVar.b, B);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + B);
        }
        Context context = this.a;
        String str = this.b;
        tig0 tig0Var = new tig0(context, str, this.c);
        if (this.e == null) {
            rmb1.g(yvi0Var.t(), tig0Var);
            return yvi0Var;
        }
        jb7 t = yvi0Var.t();
        aa2 aa2Var = this.e;
        byte[] bArr = new byte[0];
        ilx ilxVar = (ilx) t.b;
        byte[] a = aa2Var.a(ilxVar.e(), bArr);
        try {
            if (!ilx.F(aa2Var.b(a, bArr), oyo.b()).equals(ilxVar)) {
                throw new GeneralSecurityException("cannot encrypt keyset");
            }
            wzn A = xzn.A();
            ByteString f = ByteString.f(0, a.length, a);
            A.e();
            xzn.x((xzn) A.b, f);
            plx a2 = qw21.a(ilxVar);
            A.e();
            xzn.y((xzn) A.b, a2);
            if (((SharedPreferences.Editor) tig0Var.a).putString(str, s8o.j(((xzn) A.b()).e())).commit()) {
                return yvi0Var;
            }
            ny61.v("Failed to write to SharedPreferences");
            return null;
        } catch (InvalidProtocolBufferException unused) {
            kbs.v("invalid keyset, corrupted key material");
            return null;
        }
    }

    public final aa2 c() {
        ba2 ba2Var = new ba2();
        try {
            boolean a = ba2.a(this.d);
            try {
                return ba2Var.c(this.d);
            } catch (GeneralSecurityException | ProviderException e) {
                if (a) {
                    return null;
                }
                throw new KeyStoreException(oyr.p("the master key ", this.d, " exists but is unusable"), e);
            }
        } catch (GeneralSecurityException | ProviderException unused) {
            return null;
        }
    }

    public final void d(String str) {
        if (str.startsWith("android-keystore://")) {
            this.d = str;
        } else {
            ny61.g("key URI must start with android-keystore://");
        }
    }
}
