package io.flutter.embedding.android;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class b {
    public final String a;
    public boolean b = false;
    public boolean c = false;
    public RenderMode d = RenderMode.surface;
    public TransparencyMode e = TransparencyMode.transparent;
    public boolean f = true;
    public boolean g = false;
    public boolean h = false;

    public b(String str) {
        this.a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("cached_engine_id", this.a);
        bundle.putBoolean("destroy_engine_with_fragment", this.b);
        bundle.putBoolean("handle_deeplinking", this.c);
        RenderMode renderMode = this.d;
        if (renderMode == null) {
            renderMode = RenderMode.surface;
        }
        bundle.putString("flutterview_render_mode", renderMode.name());
        TransparencyMode transparencyMode = this.e;
        if (transparencyMode == null) {
            transparencyMode = TransparencyMode.transparent;
        }
        bundle.putString("flutterview_transparency_mode", transparencyMode.name());
        bundle.putBoolean("should_attach_engine_to_activity", this.f);
        bundle.putBoolean("should_automatically_handle_on_back_pressed", this.g);
        bundle.putBoolean("should_delay_first_android_view_draw", this.h);
        return bundle;
    }
}
