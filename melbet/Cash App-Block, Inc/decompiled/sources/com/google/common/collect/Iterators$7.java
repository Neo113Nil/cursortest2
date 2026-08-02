package com.google.common.collect;

import androidx.glance.appwidget.protobuf.ByteString$LiteralByteString;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.fido.zzgu;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaks;
import com.google.android.libraries.places.internal.zzbim;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Iterators$7 implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public int count;
    public final /* synthetic */ Object val$iterator;
    public final int val$limitSize;

    public Iterators$7(zzgu zzguVar) {
        this.$r8$classId = 3;
        this.val$iterator = zzguVar;
        this.count = 0;
        this.val$limitSize = zzguVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.$r8$classId;
        int i2 = this.val$limitSize;
        switch (i) {
            case 0:
                if (this.count < i2 && ((Iterator) this.val$iterator).hasNext()) {
                    break;
                }
                break;
            case 1:
                if (this.count < i2) {
                    break;
                }
                break;
            case 2:
                if (this.count < i2) {
                    break;
                }
                break;
            case 3:
                if (this.count < i2) {
                    break;
                }
                break;
            case 4:
                if (this.count < i2) {
                    break;
                }
                break;
            case 5:
                if (this.count < i2) {
                    break;
                }
                break;
            case 6:
                if (this.count < i2) {
                    break;
                }
                break;
            default:
                if (this.count < i2) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.$r8$classId;
        int i2 = this.val$limitSize;
        Object obj = this.val$iterator;
        switch (i) {
            case 0:
                if (hasNext()) {
                    this.count++;
                    return ((Iterator) obj).next();
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 1:
                return Byte.valueOf(nextByte());
            case 2:
                int i3 = this.count;
                if (i3 < i2) {
                    this.count = i3 + 1;
                    return Byte.valueOf(((ByteString$LiteralByteString) obj).internalByteAt(i3));
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 3:
                int i4 = this.count;
                if (i4 < i2) {
                    this.count = i4 + 1;
                    return Byte.valueOf(((zzgu) obj).zzb(i4));
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 4:
                int i5 = this.count;
                if (i5 < i2) {
                    this.count = i5 + 1;
                    return Byte.valueOf(((zzacr) obj).zza(i5));
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 5:
                int i6 = this.count;
                if (i6 < i2) {
                    this.count = i6 + 1;
                    return Byte.valueOf(((zzaks) obj).zzb(i6));
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            case 6:
                int i7 = this.count;
                if (i7 < i2) {
                    this.count = i7 + 1;
                    return Byte.valueOf(((zzbim) obj).zza(i7));
                }
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            default:
                return Byte.valueOf(nextByte());
        }
    }

    public byte nextByte() {
        switch (this.$r8$classId) {
            case 1:
                int i = this.count;
                if (i >= this.val$limitSize) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this.count = i + 1;
                    break;
                }
            default:
                int i2 = this.count;
                if (i2 >= this.val$limitSize) {
                    a$$ExternalSyntheticBUOutline0.m();
                    break;
                } else {
                    this.count = i2 + 1;
                    break;
                }
        }
        return (byte) 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                ((Iterator) this.val$iterator).remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Iterators$7(zzacr zzacrVar) {
        this.$r8$classId = 4;
        this.val$iterator = zzacrVar;
        this.count = 0;
        this.val$limitSize = zzacrVar.zzb();
    }

    public Iterators$7(zzaks zzaksVar) {
        this.$r8$classId = 5;
        this.val$iterator = zzaksVar;
        this.count = 0;
        this.val$limitSize = zzaksVar.zzd();
    }

    public Iterators$7(zzbim zzbimVar) {
        this.$r8$classId = 6;
        this.val$iterator = zzbimVar;
        this.count = 0;
        this.val$limitSize = zzbimVar.zzb();
    }

    public Iterators$7(androidx.datastore.preferences.protobuf.ByteString$LiteralByteString byteString$LiteralByteString) {
        this.$r8$classId = 1;
        this.val$iterator = byteString$LiteralByteString;
        this.count = 0;
        this.val$limitSize = byteString$LiteralByteString.size();
    }

    public Iterators$7(ByteString$LiteralByteString byteString$LiteralByteString) {
        this.$r8$classId = 2;
        this.val$iterator = byteString$LiteralByteString;
        this.count = 0;
        this.val$limitSize = byteString$LiteralByteString.size();
    }

    public Iterators$7(ByteString byteString) {
        this.$r8$classId = 7;
        this.val$iterator = byteString;
        this.count = 0;
        this.val$limitSize = byteString.size();
    }

    public Iterators$7(Iterator it, int i) {
        this.$r8$classId = 0;
        this.val$limitSize = i;
        this.val$iterator = it;
    }
}
