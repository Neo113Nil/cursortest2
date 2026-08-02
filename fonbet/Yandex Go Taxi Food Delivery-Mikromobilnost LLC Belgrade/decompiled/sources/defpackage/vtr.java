package defpackage;

import android.graphics.Rect;
import com.yandex.mapkit.ScreenRect;

/* loaded from: classes6.dex */
public final class vtr implements utr, a3v {
    public final /* synthetic */ a3v a;
    public final /* synthetic */ wtr b;

    public vtr(wtr wtrVar) {
        this.b = wtrVar;
        this.a = wtrVar.b;
    }

    @Override // defpackage.a3v
    public final void F8(int i, int i2, Object obj) {
        this.a.F8(i, i2, obj);
    }

    @Override // defpackage.a3v
    public final Rect Gf() {
        return this.a.Gf();
    }

    @Override // defpackage.a3v
    public final void Lc(Object obj, Rect rect) {
        this.a.Lc(obj, rect);
    }

    @Override // defpackage.a3v
    public final tpr M2() {
        return this.a.M2();
    }

    @Override // defpackage.utr
    public final void P2(int i) {
        wtr wtrVar = this.b;
        if (wtrVar.c != 0) {
            wtrVar.b.q3(wtrVar.a, 0, 0, 0, i);
        }
    }

    @Override // defpackage.a3v
    public final tpr Pd() {
        return this.a.Pd();
    }

    @Override // defpackage.a3v
    public final void Td(int i, Object obj) {
        this.a.Td(i, obj);
    }

    @Override // defpackage.a3v
    public final void a0(Object obj) {
        this.a.a0(obj);
    }

    @Override // defpackage.a3v
    public final void b8(Object obj) {
        this.a.b8(obj);
    }

    @Override // defpackage.a3v
    public final ScreenRect getFocusRect() {
        return this.a.getFocusRect();
    }

    @Override // defpackage.a3v
    public final tpr m1() {
        return this.a.m1();
    }

    @Override // defpackage.a3v
    public final void q3(Object obj, int i, int i2, int i3, int i4) {
        this.a.q3(obj, i, i2, i3, i4);
    }

    @Override // defpackage.a3v
    public final void requestFocusRect() {
        this.a.requestFocusRect();
    }

    @Override // defpackage.a3v
    public final void t4(Object obj) {
        this.a.t4(obj);
    }
}
