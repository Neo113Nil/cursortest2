package defpackage;

import androidx.datastore.preferences.protobuf.ByteString;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.play_billing.zzgk;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class q77 implements Iterator {
    public final /* synthetic */ int a = 2;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object w;

    public q77(zzgx zzgxVar) {
        this.w = zzgxVar;
        this.c = zzgxVar.f();
    }

    public byte a() {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i >= this.c) {
                    ny61.p();
                    break;
                } else {
                    this.b = i + 1;
                    break;
                }
            case 1:
                int i2 = this.b;
                if (i2 >= this.c) {
                    ny61.p();
                    break;
                } else {
                    this.b = i2 + 1;
                    break;
                }
            default:
                int i3 = this.b;
                if (i3 >= this.c) {
                    ny61.p();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
        }
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < this.c) {
                }
                break;
            case 1:
                if (this.b < this.c) {
                }
                break;
            case 2:
                if (this.b < this.c) {
                }
                break;
            case 3:
                if (this.b < this.c) {
                }
                break;
            case 4:
                if (this.b < this.c) {
                }
                break;
            default:
                if (this.b < this.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.w;
        int i2 = this.c;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                int i3 = this.b;
                if (i3 >= i2) {
                    ny61.p();
                    break;
                } else {
                    this.b = i3 + 1;
                    break;
                }
            case 4:
                int i4 = this.b;
                if (i4 >= i2) {
                    ny61.p();
                    break;
                } else {
                    this.b = i4 + 1;
                    break;
                }
            default:
                int i5 = this.b;
                if (i5 >= i2) {
                    ny61.p();
                    break;
                } else {
                    this.b = i5 + 1;
                    break;
                }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public q77(zzlh zzlhVar) {
        this.w = zzlhVar;
        this.c = zzlhVar.f();
    }

    public q77(zzgk zzgkVar) {
        this.w = zzgkVar;
        this.c = zzgkVar.f();
    }

    public q77(ByteString byteString) {
        this.w = byteString;
        this.c = byteString.size();
    }

    public q77(com.google.protobuf.ByteString byteString) {
        this.w = byteString;
        this.c = byteString.size();
    }

    public q77(com.google.crypto.tink.shaded.protobuf.ByteString byteString) {
        this.w = byteString;
        this.c = byteString.size();
    }
}
