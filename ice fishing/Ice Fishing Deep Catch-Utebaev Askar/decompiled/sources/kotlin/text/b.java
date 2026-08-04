package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f191a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IntRange f194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f196f;

    public b(c cVar) {
        this.f196f = cVar;
        int i2 = cVar.f198b;
        int length = cVar.f197a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f192b = i2;
        this.f193c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public final void a() {
        Pair pairA;
        IntRange intRange;
        int i2 = this.f193c;
        if (i2 < 0) {
            this.f191a = 0;
            this.f194d = null;
            return;
        }
        c cVar = this.f196f;
        int i3 = cVar.f199c;
        CharSequence charSequence = cVar.f197a;
        if (i3 > 0) {
            int i4 = this.f195e + 1;
            this.f195e = i4;
            if (i4 < i3) {
                if (i2 > charSequence.length()) {
                    int i5 = this.f192b;
                    Intrinsics.checkNotNullParameter(charSequence, "<this>");
                    intRange = new IntRange(i5, charSequence.length() - 1);
                } else {
                    pairA = cVar.f200d.a(charSequence, Integer.valueOf(this.f193c));
                    if (pairA == null) {
                        int i6 = this.f192b;
                        Intrinsics.checkNotNullParameter(charSequence, "<this>");
                        intRange = new IntRange(i6, charSequence.length() - 1);
                    } else {
                        int iIntValue = ((Number) pairA.f155a).intValue();
                        int iIntValue2 = ((Number) pairA.f156b).intValue();
                        this.f194d = n.f.a(this.f192b, iIntValue);
                        int i7 = iIntValue + iIntValue2;
                        this.f192b = i7;
                        this.f193c = i7 + (iIntValue2 == 0 ? 1 : 0);
                    }
                }
                this.f194d = intRange;
                this.f193c = -1;
            } else {
                int i8 = this.f192b;
                Intrinsics.checkNotNullParameter(charSequence, "<this>");
                intRange = new IntRange(i8, charSequence.length() - 1);
                this.f194d = intRange;
                this.f193c = -1;
            }
        } else {
            if (i2 > charSequence.length()) {
                int i9 = this.f192b;
                Intrinsics.checkNotNullParameter(charSequence, "<this>");
                intRange = new IntRange(i9, charSequence.length() - 1);
            } else {
                pairA = cVar.f200d.a(charSequence, Integer.valueOf(this.f193c));
                if (pairA == null) {
                    int i10 = this.f192b;
                    Intrinsics.checkNotNullParameter(charSequence, "<this>");
                    intRange = new IntRange(i10, charSequence.length() - 1);
                } else {
                    int iIntValue3 = ((Number) pairA.f155a).intValue();
                    int iIntValue4 = ((Number) pairA.f156b).intValue();
                    this.f194d = n.f.a(this.f192b, iIntValue3);
                    int i11 = iIntValue3 + iIntValue4;
                    this.f192b = i11;
                    this.f193c = i11 + (iIntValue4 == 0 ? 1 : 0);
                }
            }
            this.f194d = intRange;
            this.f193c = -1;
        }
        this.f191a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f191a == -1) {
            a();
        }
        return this.f191a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f191a == -1) {
            a();
        }
        if (this.f191a == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f194d;
        Intrinsics.c(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f194d = null;
        this.f191a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
