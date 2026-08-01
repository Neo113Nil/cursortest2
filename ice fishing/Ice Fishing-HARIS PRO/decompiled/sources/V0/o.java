package V0;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1295a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final p f1296b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1297c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1298d;

    public o(p pVar, M0.h hVar) {
        this.f1296b = pVar;
        TypedArray typedArray = (TypedArray) hVar.f617c;
        this.f1297c = typedArray.getResourceId(28, 0);
        this.f1298d = typedArray.getResourceId(52, 0);
    }
}
