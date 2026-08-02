package ru.yandex.taxi.design.utils;

import android.renderscript.ScriptIntrinsicBlur;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class OverlayShadowUtil$blurProvider$2 extends FunctionReferenceImpl implements tls {
    public static final OverlayShadowUtil$blurProvider$2 b = new OverlayShadowUtil$blurProvider$2(1, 0, ScriptIntrinsicBlur.class, "destroy", "destroy()V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((ScriptIntrinsicBlur) obj).destroy();
        return zy11.a;
    }
}
