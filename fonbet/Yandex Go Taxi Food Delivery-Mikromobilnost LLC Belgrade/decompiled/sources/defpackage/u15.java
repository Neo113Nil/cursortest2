package defpackage;

import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.MapObject;

/* loaded from: classes6.dex */
public abstract class u15 extends ap00 {
    public Object h;

    public u15(Class cls, Object obj) {
        super(cls);
        this.h = obj;
    }

    @Override // defpackage.ap00
    public final MapObject c(BaseMapObjectCollection baseMapObjectCollection) {
        return l(baseMapObjectCollection, this.h);
    }

    @Override // defpackage.ap00
    public void f() {
        vez0.h0();
        super.f();
        n(this.g, this.h);
    }

    public abstract MapObject l(BaseMapObjectCollection baseMapObjectCollection, Object obj);

    public final Object m() {
        return this.h;
    }

    public abstract void n(MapObject mapObject, Object obj);

    public final void o(Object obj) {
        this.h = obj;
        if (this.g != this.a) {
            vez0.h0();
            n(this.g, obj);
            this.g.setVisible(this.b);
        }
    }
}
