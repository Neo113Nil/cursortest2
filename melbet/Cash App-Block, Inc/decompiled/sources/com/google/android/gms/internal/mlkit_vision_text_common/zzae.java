package com.google.android.gms.internal.mlkit_vision_text_common;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzde;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdf;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.RopeByteString;

/* loaded from: classes4.dex */
public final class zzae implements Iterator {
    public final /* synthetic */ int $r8$classId;
    public Object zza;
    public Object zzb;

    public zzae(zzdf zzdfVar) {
        this.$r8$classId = 1;
        if (!(zzdfVar instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd)) {
            this.zza = null;
            this.zzb = (zzde) zzdfVar;
            return;
        }
        com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd zzgdVar = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) zzdfVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgdVar.zzg);
        this.zza = arrayDeque;
        arrayDeque.push(zzgdVar);
        zzdf zzdfVar2 = zzgdVar.zzd;
        while (zzdfVar2 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) {
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd zzgdVar2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) zzdfVar2;
            ((ArrayDeque) this.zza).push(zzgdVar2);
            zzdfVar2 = zzgdVar2.zzd;
        }
        this.zzb = (zzde) zzdfVar2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.$r8$classId) {
            case 0:
                return ((Iterator) this.zzb).hasNext();
            case 1:
                return ((zzde) this.zzb) != null;
            default:
                return ((LiteralByteString) this.zzb) != null;
        }
    }

    @Override // java.util.Iterator
    public LiteralByteString next() {
        Stack stack = (Stack) this.zza;
        LiteralByteString literalByteString = (LiteralByteString) this.zzb;
        LiteralByteString literalByteString2 = null;
        if (literalByteString == null) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        while (true) {
            if (stack.isEmpty()) {
                break;
            }
            ByteString byteString = ((RopeByteString) stack.pop()).right;
            while (byteString instanceof RopeByteString) {
                RopeByteString ropeByteString = (RopeByteString) byteString;
                stack.push(ropeByteString);
                byteString = ropeByteString.left;
            }
            LiteralByteString literalByteString3 = (LiteralByteString) byteString;
            if (!literalByteString3.isEmpty()) {
                literalByteString2 = literalByteString3;
                break;
            }
        }
        this.zzb = literalByteString2;
        return literalByteString;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.$r8$classId) {
            case 0:
                Map.Entry entry = (Map.Entry) this.zza;
                if (!(entry != null)) {
                    a$$ExternalSyntheticBUOutline0.m$1("no calls to next() since the last call to remove()");
                    return;
                }
                Collection collection = (Collection) entry.getValue();
                ((Iterator) this.zzb).remove();
                collection.size();
                collection.clear();
                this.zza = null;
                return;
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public zzde zza() {
        ArrayDeque arrayDeque = (ArrayDeque) this.zza;
        zzde zzdeVar = (zzde) this.zzb;
        zzde zzdeVar2 = null;
        if (zzdeVar == null) {
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        while (true) {
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzdf zzdfVar = ((com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) arrayDeque.pop()).zze;
            while (zzdfVar instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) {
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd zzgdVar = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzgd) zzdfVar;
                arrayDeque.push(zzgdVar);
                zzdfVar = zzgdVar.zzd;
            }
            zzde zzdeVar3 = (zzde) zzdfVar;
            if (zzdeVar3.zzd() != 0) {
                zzdeVar2 = zzdeVar3;
                break;
            }
        }
        this.zzb = zzdeVar2;
        return zzdeVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.$r8$classId) {
            case 0:
                Map.Entry entry = (Map.Entry) ((Iterator) this.zzb).next();
                this.zza = entry;
                return entry.getKey();
            case 1:
                return zza();
            default:
                return next();
        }
    }

    public zzae(zzab zzabVar, Iterator it) {
        this.$r8$classId = 0;
        this.zzb = it;
    }

    public zzae(ByteString byteString) {
        this.$r8$classId = 2;
        this.zza = new Stack();
        while (byteString instanceof RopeByteString) {
            RopeByteString ropeByteString = (RopeByteString) byteString;
            ((Stack) this.zza).push(ropeByteString);
            byteString = ropeByteString.left;
        }
        this.zzb = (LiteralByteString) byteString;
    }
}
