package defpackage;

import android.content.res.TypedArray;
import com.ybsdk.core.utils.ext.view.b;

/* loaded from: classes4.dex */
public final class x0z0 {
    public int a;
    public int b;
    public float c;
    public float d;
    public float e;
    public String f;
    public int g;
    public float h;
    public int i;

    public final void a(TypedArray typedArray) {
        this.a = typedArray.getInt(t3i0.YbSdkTickerView_android_gravity, this.a);
        this.b = typedArray.getColor(t3i0.YbSdkTickerView_android_shadowColor, this.b);
        this.c = typedArray.getFloat(t3i0.YbSdkTickerView_android_shadowDx, this.c);
        this.d = typedArray.getFloat(t3i0.YbSdkTickerView_android_shadowDy, this.d);
        this.e = typedArray.getFloat(t3i0.YbSdkTickerView_android_shadowRadius, this.e);
        this.f = typedArray.getString(t3i0.YbSdkTickerView_android_text);
        this.g = typedArray.getColor(t3i0.YbSdkTickerView_android_textColor, this.g);
        this.h = b.v(typedArray, t3i0.YbSdkTickerView_android_textSize, this.h);
        this.i = typedArray.getInt(t3i0.YbSdkTickerView_android_textStyle, this.i);
    }
}
