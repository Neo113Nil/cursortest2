package androidx.constraintlayout.core.parser;

import com.google.android.gms.internal.measurement.zzad;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class CLObject extends CLContainer implements Iterable {
    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone */
    public final CLObject mo1081clone() {
        return (CLObject) super.mo1081clone();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        zzad zzadVar = new zzad();
        zzadVar.zzb = 0;
        zzadVar.zza = this;
        return zzadVar;
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    /* renamed from: clone */
    public final Object mo1081clone() {
        return (CLObject) super.mo1081clone();
    }
}
