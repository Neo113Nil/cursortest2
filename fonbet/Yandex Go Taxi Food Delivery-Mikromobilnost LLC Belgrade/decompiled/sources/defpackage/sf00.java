package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes9.dex */
public final class sf00 extends uf00 implements Iterator, xfx {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sf00(MapBuilder mapBuilder, int i) {
        super(mapBuilder);
        this.x = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.x;
        Serializable serializable = this.w;
        switch (i) {
            case 0:
                a();
                MapBuilder mapBuilder = (MapBuilder) serializable;
                if (this.a >= mapBuilder.length) {
                    ny61.p();
                    break;
                } else {
                    int i2 = this.a;
                    this.a = i2 + 1;
                    this.b = i2;
                    tf00 tf00Var = new tf00(mapBuilder, i2);
                    d();
                    break;
                }
            case 1:
                a();
                MapBuilder mapBuilder2 = (MapBuilder) serializable;
                if (this.a >= mapBuilder2.length) {
                    ny61.p();
                    break;
                } else {
                    int i3 = this.a;
                    this.a = i3 + 1;
                    this.b = i3;
                    Object obj = mapBuilder2.keysArray[this.b];
                    d();
                    break;
                }
            default:
                a();
                MapBuilder mapBuilder3 = (MapBuilder) serializable;
                if (this.a >= mapBuilder3.length) {
                    ny61.p();
                    break;
                } else {
                    int i4 = this.a;
                    this.a = i4 + 1;
                    this.b = i4;
                    Object obj2 = mapBuilder3.valuesArray[this.b];
                    d();
                    break;
                }
        }
        return null;
    }
}
