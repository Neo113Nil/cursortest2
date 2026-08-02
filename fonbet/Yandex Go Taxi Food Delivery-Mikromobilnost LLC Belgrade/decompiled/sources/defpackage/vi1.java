package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes13.dex */
public final class vi1 {
    public final int a;
    public final Rect b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public final Drawable g;

    public vi1(Context context) {
        float dimension = context.getResources().getDimension(mug0.shortcuts_afisha_badge_bottom_origin_offset);
        float dimension2 = context.getResources().getDimension(mug0.shortcuts_afisha_badge_left_origin_offset);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_height);
        this.a = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_width);
        context.getResources().getDimensionPixelSize(psg0.shortcuts_corners_round);
        this.b = new Rect(context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_padding_left), context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_padding_top), context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_padding_right), context.getResources().getDimensionPixelSize(mug0.shortcuts_afisha_badge_padding_bottom));
        this.c = dimension / dimensionPixelSize2;
        this.d = dimension2 / dimensionPixelSize;
        this.e = context.getColor(mqg0.component_black);
        this.f = context.getColor(mqg0.component_yellow_light);
        this.g = vng.t(y3h0.ic_afisha, context);
    }
}
