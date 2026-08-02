package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mzi {
    public static final rre b;
    public static final List c;
    public static final mzi d;
    public static final /* synthetic */ mzi[] e;
    public final int a;

    static {
        mzi mziVar = new mzi("EDGE", 0, 384);
        mzi mziVar2 = new mzi("WCDMA", 1, 2000);
        mzi mziVar3 = new mzi("HSUPA", 2, 5760);
        mzi mziVar4 = new mzi("LTE", 3, 1000000);
        d = mziVar4;
        mzi[] mziVarArr = {mziVar, mziVar2, mziVar3, mziVar4};
        e = mziVarArr;
        rdb rdbVar = new rdb(mziVarArr);
        b = new rre(28);
        c = CollectionsKt.o0(rdbVar, new ehf(14));
    }

    public mzi(String str, int i, int i2) {
        this.a = i2;
    }

    public static mzi valueOf(String str) {
        return (mzi) Enum.valueOf(mzi.class, str);
    }

    public static mzi[] values() {
        return (mzi[]) e.clone();
    }
}
