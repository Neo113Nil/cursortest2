package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.internal.ads.C4124wK;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Y extends Writer {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4891n;

    /* renamed from: u, reason: collision with root package name */
    public final StringBuilder f4892u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f4893v;

    public Y(StringBuilder sb) {
        this.f4891n = 1;
        this.f4893v = new C4124wK();
        this.f4892u = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.f4891n) {
            case 1:
                this.f4892u.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f4891n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.f4891n) {
            case 0:
                z();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i4) {
        switch (this.f4891n) {
            case 0:
                for (int i6 = 0; i6 < i4; i6++) {
                    char c9 = cArr[i + i6];
                    if (c9 == '\n') {
                        z();
                    } else {
                        this.f4892u.append(c9);
                    }
                }
                break;
            default:
                C4124wK c4124wK = (C4124wK) this.f4893v;
                c4124wK.f35597n = cArr;
                c4124wK.f35598u = null;
                this.f4892u.append((CharSequence) c4124wK, i, i4 + i);
                break;
        }
    }

    public void z() {
        StringBuilder sb = this.f4892u;
        if (sb.length() > 0) {
            Log.d((String) this.f4893v, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        switch (this.f4891n) {
            case 1:
                append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i4) {
        switch (this.f4891n) {
            case 1:
                this.f4892u.append(charSequence, i, i4);
                return this;
            default:
                return super.append(charSequence, i, i4);
        }
    }

    public Y() {
        this.f4891n = 0;
        this.f4892u = new StringBuilder(128);
        this.f4893v = "FragmentManager";
    }

    @Override // java.io.Writer, java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i4) {
        switch (this.f4891n) {
            case 1:
                append(charSequence, i, i4);
                return this;
            default:
                return super.append(charSequence, i, i4);
        }
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.f4891n) {
            case 1:
                this.f4892u.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i4) {
        switch (this.f4891n) {
            case 1:
                Objects.requireNonNull(str);
                this.f4892u.append((CharSequence) str, i, i4 + i);
                break;
            default:
                super.write(str, i, i4);
                break;
        }
    }

    private final void b() {
    }

    private final void j() {
    }
}
