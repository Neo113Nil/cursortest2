package s;

import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements Iterator, qc.a {

    /* renamed from: g, reason: collision with root package name */
    public int f6221g;

    /* renamed from: h, reason: collision with root package name */
    public int f6222h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f6223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6224j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f6225k;

    public b(int i10) {
        this.f6221g = i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6222h < this.f6221g;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object e10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f6222h;
        switch (this.f6224j) {
            case 0:
                e10 = ((f) this.f6225k).e(i10);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                e10 = ((f) this.f6225k).h(i10);
                break;
            default:
                e10 = ((g) this.f6225k).f6264h[i10];
                break;
        }
        this.f6222h++;
        this.f6223i = true;
        return e10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f6223i) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.f6222h - 1;
        this.f6222h = i10;
        switch (this.f6224j) {
            case 0:
                ((f) this.f6225k).f(i10);
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                ((f) this.f6225k).f(i10);
                break;
            default:
                ((g) this.f6225k).a(i10);
                break;
        }
        this.f6221g--;
        this.f6223i = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(g gVar) {
        this(gVar.f6265i);
        this.f6224j = 2;
        this.f6225k = gVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(f fVar, int i10) {
        this(fVar.f6325i);
        this.f6224j = i10;
        switch (i10) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                this.f6225k = fVar;
                this(fVar.f6325i);
                break;
            default:
                this.f6225k = fVar;
                break;
        }
    }
}
