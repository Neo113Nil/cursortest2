package g;

import java.io.Serializable;
import kotlin.collections.d;
import kotlin.collections.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a extends h implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enum[] f126b;

    public a(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.f126b = entries;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f126b.length;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f126b;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        if (iOrdinal >= 0) {
            Intrinsics.checkNotNullParameter(enumArr, "<this>");
            if (iOrdinal <= enumArr.length - 1) {
                r0 = enumArr[iOrdinal];
            } else {
                r0 = null;
            }
        } else {
            r0 = null;
        }
        return r0 == element;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        d dVar = h.f173a;
        Enum[] enumArr = this.f126b;
        int length = enumArr.length;
        dVar.getClass();
        d.a(i2, length);
        return enumArr[i2];
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    @Override // kotlin.collections.h, java.util.List
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        Enum[] enumArr = this.f126b;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        if (iOrdinal >= 0) {
            Intrinsics.checkNotNullParameter(enumArr, "<this>");
            if (iOrdinal <= enumArr.length - 1) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        if (r2 == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // kotlin.collections.h, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
