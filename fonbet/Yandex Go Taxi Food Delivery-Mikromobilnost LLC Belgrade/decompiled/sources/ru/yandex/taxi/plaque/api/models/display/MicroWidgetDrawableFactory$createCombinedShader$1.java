package ru.yandex.taxi.plaque.api.models.display;

import android.graphics.ComposeShader;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/plaque/api/models/display/MicroWidgetDrawableFactory$createCombinedShader$1", "Landroid/graphics/drawable/ShapeDrawable$ShaderFactory;", "", "width", "height", "Landroid/graphics/Shader;", "resize", "(II)Landroid/graphics/Shader;", "plaque_sdk"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MicroWidgetDrawableFactory$createCombinedShader$1 extends ShapeDrawable.ShaderFactory {
    final /* synthetic */ List<ShapeDrawable.ShaderFactory> $shaderFactories;

    /* JADX WARN: Multi-variable type inference failed */
    public MicroWidgetDrawableFactory$createCombinedShader$1(List<? extends ShapeDrawable.ShaderFactory> list) {
        this.$shaderFactories = list;
    }

    @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
    public Shader resize(int width, int height) {
        List<ShapeDrawable.ShaderFactory> list = this.$shaderFactories;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ShapeDrawable.ShaderFactory) it.next()).resize(width, height));
        }
        Shader shader = (Shader) arrayList.get(0);
        int size = arrayList.size();
        int i = 1;
        while (i < size) {
            ComposeShader composeShader = new ComposeShader((Shader) arrayList.get(i), shader, PorterDuff.Mode.DST_OVER);
            i++;
            shader = composeShader;
        }
        return shader;
    }
}
