package com.yandex.passport.internal.ui.bouncer.roundabout.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.yandex.passport.R;
import com.yandex.passport.common.resources.c;
import com.yandex.passport.internal.ui.bouncer.roundabout.b0;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.m;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.s;
import com.yandex.passport.internal.ui.bouncer.roundabout.items.u;
import defpackage.b6e;
import defpackage.e7t;
import defpackage.f3o;
import defpackage.g4i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements e7t {
    public final Context a;
    public final u b;
    public final int c;
    public final int d;
    public final String e;

    public a(Context context, u uVar) {
        uVar.getClass();
        this.a = context;
        this.b = uVar;
        this.c = ((int) (24 * g4i.a.density)) / 2;
        this.d = b0.b;
        this.e = a.class.getName() + '-' + uVar;
    }

    @Override // defpackage.e7t
    public final String a() {
        return this.e;
    }

    @Override // defpackage.e7t
    public final Bitmap b(Bitmap bitmap) {
        c cVar;
        Integer valueOf;
        bitmap.getClass();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (i - bitmap.getWidth()) / 2.0f, (i - bitmap.getHeight()) / 2.0f, new Paint(3));
        u uVar = this.b;
        if (uVar instanceof m) {
            cVar = new c(R.drawable.passport_roundabout_child);
        } else {
            if (uVar instanceof s) {
                switch (((s) uVar).a.ordinal()) {
                    case 0:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_vk);
                        break;
                    case 1:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_fb);
                        break;
                    case 2:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_twitter);
                        break;
                    case 3:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_ok);
                        break;
                    case 4:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_mail);
                        break;
                    case 5:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_google);
                        break;
                    case 6:
                        valueOf = Integer.valueOf(R.drawable.passport_social_roundabout_esia);
                        break;
                    case 7:
                        valueOf = null;
                        break;
                    default:
                        b6e.s();
                        return null;
                }
                if (valueOf != null) {
                    cVar = new c(valueOf.intValue());
                }
            }
            cVar = null;
        }
        Context context = this.a;
        Drawable a = cVar != null ? c.a(context, cVar.a) : null;
        if (a != null) {
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint(1);
            int i2 = R.color.passport_roundabout_background;
            int i3 = f3o.a;
            paint.setColor(context.getColor(i2));
            int i4 = this.c;
            int i5 = i - i4;
            float f = i5;
            canvas.drawCircle(f, f, i4, paint);
            int intrinsicWidth = a.getIntrinsicWidth() / 2;
            int intrinsicHeight = a.getIntrinsicHeight() / 2;
            a.setBounds(new Rect(i5 - intrinsicWidth, i5 - intrinsicHeight, intrinsicWidth + i5, i5 + intrinsicHeight));
            a.draw(canvas);
        }
        return createBitmap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.b, ((a) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
