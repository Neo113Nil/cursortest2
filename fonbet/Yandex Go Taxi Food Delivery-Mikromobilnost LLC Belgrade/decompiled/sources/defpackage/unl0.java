package defpackage;

import android.graphics.Path;
import com.caverock.androidsvg.m;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class unl0 implements mml0, hq31 {
    public float a;
    public float b;
    public final Object c;

    public unl0(yi6 yi6Var) {
        this.c = new Path();
        if (yi6Var == null) {
            return;
        }
        yi6Var.g(this);
    }

    @Override // defpackage.mml0
    public void R(float f, float f2) {
        ((Path) this.c).moveTo(f, f2);
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mml0
    public void S(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        m.a(this.a, this.b, f, f2, f3, z, z2, f4, f5, this);
        this.a = f4;
        this.b = f5;
    }

    @Override // defpackage.mml0
    public void T(float f, float f2) {
        ((Path) this.c).lineTo(f, f2);
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.mml0
    public void U(float f, float f2, float f3, float f4) {
        ((Path) this.c).quadTo(f, f2, f3, f4);
        this.a = f3;
        this.b = f4;
    }

    @Override // defpackage.mml0
    public void V(float f, float f2, float f3, float f4, float f5, float f6) {
        ((Path) this.c).cubicTo(f, f2, f3, f4, f5, f6);
        this.a = f5;
        this.b = f6;
    }

    @Override // defpackage.hq31
    public Map a() {
        return b.i(new Pair("shortcut_id", (String) this.c), new Pair("visibility_height", Float.valueOf(this.a)), new Pair("visibility_width", Float.valueOf(this.b)));
    }

    @Override // defpackage.mml0
    public void close() {
        ((Path) this.c).close();
    }

    @Override // defpackage.hq31
    public float e() {
        return this.a;
    }

    @Override // defpackage.hq31
    public float u() {
        return this.b;
    }

    public unl0(String str, float f, float f2) {
        this.c = str;
        this.a = f;
        this.b = f2;
    }
}
