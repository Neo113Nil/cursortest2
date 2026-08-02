package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes4.dex */
public final class ruz extends e06 {
    public final Context a;
    public RenderScript b;

    public ruz(Context context) {
        this.a = context;
    }

    @Override // defpackage.e06
    public final Bitmap a(float f, Bitmap bitmap) {
        float f2;
        Bitmap createScaledBitmap;
        if (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || f <= 0.0f) {
            return bitmap;
        }
        RenderScript renderScript = this.b;
        if (renderScript == null) {
            RenderScript.ContextType contextType = RenderScript.ContextType.NORMAL;
            Context context = this.a;
            renderScript = RenderScript.createMultiContext(context, contextType, 0, context.getApplicationInfo().targetSdkVersion);
            this.b = renderScript;
        }
        if (f > 25.0f) {
            float f3 = (f * 1.0f) / 25.0f;
            f = 25.0f;
            f2 = f3;
        } else {
            f2 = 1.0f;
        }
        if (f2 == 1.0f) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            createScaledBitmap = bitmap.copy(config, false);
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / f2), (int) (bitmap.getHeight() / f2), false);
        }
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, createScaledBitmap);
        Allocation createTyped = Allocation.createTyped(renderScript, createFromBitmap.getType());
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        create.setRadius(f);
        create.setInput(createFromBitmap);
        create.forEach(createTyped);
        createTyped.copyTo(createScaledBitmap);
        createFromBitmap.destroy();
        createTyped.destroy();
        create.destroy();
        return createScaledBitmap;
    }

    @Override // defpackage.e06
    public final Bitmap b(float f, Bitmap bitmap) {
        if (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0 || f <= 0.0f) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ALPHA_8);
        RenderScript renderScript = this.b;
        if (renderScript == null) {
            RenderScript.ContextType contextType = RenderScript.ContextType.NORMAL;
            Context context = this.a;
            renderScript = RenderScript.createMultiContext(context, contextType, 0, context.getApplicationInfo().targetSdkVersion);
            this.b = renderScript;
        }
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.A_8(renderScript));
        Allocation createFromBitmap = Allocation.createFromBitmap(renderScript, bitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(renderScript, createBitmap);
        create.setRadius(f);
        create.setInput(createFromBitmap);
        create.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        createFromBitmap2.destroy();
        createFromBitmap.destroy();
        create.destroy();
        return createBitmap;
    }

    @Override // defpackage.e06
    public final float c(float f) {
        if (f <= 25.0f) {
            return 1.0f;
        }
        return 25.0f / f;
    }

    @Override // defpackage.e06
    public final float d(float f) {
        return y6i0.c(f, 1.0f, 25.0f);
    }

    @Override // defpackage.e06
    public final void e() {
        RenderScript renderScript = this.b;
        if (renderScript != null) {
            renderScript.destroy();
        }
        this.b = null;
    }
}
