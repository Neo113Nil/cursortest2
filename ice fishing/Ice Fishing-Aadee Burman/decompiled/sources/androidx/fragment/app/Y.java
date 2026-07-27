package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.internal.ads.C4101wK;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y extends Writer {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4923n;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f4924u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f4925v;

    public Y(StringBuilder sb) {
        this.f4923n = 1;
        this.f4925v = new C4101wK();
        this.f4924u = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f4923n) {
            case 1:
                this.f4924u.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4923n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f4923n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i6) {
        switch (this.f4923n) {
            case 0:
                for (int i9 = 0; i9 < i6; i9++) {
                    char c9 = cArr[i + i9];
                    if (c9 == '\n') {
                        z();
                    } else {
                        this.f4924u.append(c9);
                    }
                }
                break;
            default:
                C4101wK c4101wK = (C4101wK) this.f4925v;
                c4101wK.f34828n = cArr;
                c4101wK.f34829u = null;
                this.f4924u.append((CharSequence) c4101wK, i, i6 + i);
                break;
        }
    }

    public void z() {
        StringBuilder sb = this.f4924u;
        if (sb.length() > 0) {
            Log.d((String) this.f4925v, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f4923n) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i6) {
        switch (this.f4923n) {
            case 1:
                this.f4924u.append(charSequence, i, i6);
                return this;
            default:
                return super.append(charSequence, i, i6);
        }
    }

    public Y() {
        this.f4923n = 0;
        this.f4924u = new StringBuilder(128);
        this.f4925v = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i6) {
        switch (this.f4923n) {
            case 1:
                append(charSequence, i, i6);
                return this;
            default:
                return super.append(charSequence, i, i6);
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.f4923n) {
            case 1:
                this.f4924u.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i6) {
        switch (this.f4923n) {
            case 1:
                Objects.requireNonNull(str);
                this.f4924u.append((CharSequence) str, i, i6 + i);
                break;
            default:
                super.write(str, i, i6);
                break;
        }
    }

    private final void b() {
    }

    private final void j() {
    }
}
