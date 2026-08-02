package defpackage;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.feature.pinstorage.internal.data.PinTokenAmModel;
import java.util.Map;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class sm91 {
    public static void a(View view, AppCompatTextView appCompatTextView, int i, float f, float f2) {
        Float valueOf = Float.valueOf(0.0f);
        float w = kp50.w(appCompatTextView.getTextSize());
        float abs = Math.abs(i) / (f - 0.0f);
        float c = (((f2 / w) - 1.0f) * (abs == abs ? y6i0.c(abs, 0.0f, 1.0f) : 1.0f)) + 1.0f;
        if (view.getScaleX() == c && view.getScaleY() == c) {
            return;
        }
        view.setPivotX(valueOf.floatValue());
        view.setScaleX(c);
        view.setScaleY(c);
    }

    public static final ShapeDrawable b(Map map) {
        final int[] I0 = a.I0(map.keySet());
        final float[] G0 = a.G0(map.values());
        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() { // from class: com.yandex.go.tariffcard.ui.util.DrawableUtilsKt$createFadeFromTopToBottom$shaderFactory$1
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public Shader resize(int width, int height) {
                return new LinearGradient(0.0f, height, 0.0f, 0.0f, I0, G0, Shader.TileMode.CLAMP);
            }
        };
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.setShaderFactory(shaderFactory);
        return shapeDrawable;
    }

    public static final Context c(zo31 zo31Var) {
        return zo31Var.getRoot().getContext();
    }

    public static final f530 d(f530 f530Var, tls tlsVar) {
        return f530Var.k(new nv60(tlsVar, new gv40(2, tlsVar)));
    }

    public static final f530 e(f530 f530Var, float f, float f2) {
        return f530Var.k(new dv60(f, f2, new gv60(f, f2, 0)));
    }

    public static f530 f(f530 f530Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return e(f530Var, f, f2);
    }

    public static final v0c0 g(PinTokenAmModel pinTokenAmModel) {
        return new v0c0(pinTokenAmModel.getToken(), pinTokenAmModel.getDeviceId(), pinTokenAmModel.getTokenBiometricUUID());
    }

    public static final void h(int i, View view) {
        i5z0.a.a("Wiggle event", new Object[0]);
        view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), i));
    }
}
