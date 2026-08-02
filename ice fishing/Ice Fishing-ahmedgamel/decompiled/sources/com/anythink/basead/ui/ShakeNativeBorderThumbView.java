package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorEvent;
import android.view.View;
import com.anythink.basead.handler.ATShackSensorListener;
import com.anythink.basead.handler.DuplicateShakeSensorChangeHandler;
import com.anythink.basead.handler.IShackSensorChangeHandler;
import com.anythink.basead.handler.ShakeSensorSetting;
import com.anythink.basead.handler.SimpleShakeSensorChangeHandler;
import com.anythink.basead.ui.BaseShakeView;
import com.anythink.basead.ui.improveclick.i;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.a.f;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class ShakeNativeBorderThumbView extends ShakeBorderThumbView {

    /* renamed from: m, reason: collision with root package name */
    IShackSensorChangeHandler f11049m;

    /* renamed from: n, reason: collision with root package name */
    a f11050n;

    /* renamed from: o, reason: collision with root package name */
    i.b f11051o;

    /* renamed from: p, reason: collision with root package name */
    private final String f11052p;

    /* renamed from: q, reason: collision with root package name */
    private f.b f11053q;

    public interface a {
        boolean a(SensorEvent sensorEvent);
    }

    public ShakeNativeBorderThumbView(Context context) {
        super(context);
        this.f11052p = "ShakeNativeBorderThumbView";
        this.f11050n = new a() { // from class: com.anythink.basead.ui.ShakeNativeBorderThumbView.1
            @Override // com.anythink.basead.ui.ShakeNativeBorderThumbView.a
            public final boolean a(SensorEvent sensorEvent) {
                IShackSensorChangeHandler iShackSensorChangeHandler;
                if (ShakeNativeBorderThumbView.this.getParent() == null || !ShakeNativeBorderThumbView.this.f11053q.a((View) ShakeNativeBorderThumbView.this.getParent(), ShakeNativeBorderThumbView.this, 80, 0) || (iShackSensorChangeHandler = ShakeNativeBorderThumbView.this.f11049m) == null) {
                    return false;
                }
                return iShackSensorChangeHandler.handleSensorData(sensorEvent);
            }
        };
        this.f11051o = new i.b() { // from class: com.anythink.basead.ui.ShakeNativeBorderThumbView.2
            @Override // com.anythink.basead.ui.improveclick.i.b
            public final int a() {
                int[] iArr = new int[2];
                ShakeNativeBorderThumbView.this.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i4 = iArr[1];
                int width = (ShakeNativeBorderThumbView.this.getWidth() / 2) + i;
                int height = (ShakeNativeBorderThumbView.this.getHeight() / 2) + i4;
                int c9 = i.a().c();
                int d9 = i.a().d() / 2;
                return (int) Math.sqrt(Math.pow(height - d9, 2.0d) + Math.pow(width - (c9 / 2), 2.0d));
            }

            @Override // com.anythink.basead.ui.improveclick.i.b
            public final a b() {
                return ShakeNativeBorderThumbView.this.f11050n;
            }
        };
        this.f11053q = new f.b(1);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void c() {
        i.a().b(this.f11051o);
    }

    public void changeBackground() {
        int a9 = q.a(getContext(), 10.0f);
        int a10 = q.a(getContext(), 10.0f);
        int a11 = q.a(getContext(), 6.0f);
        setPadding(a9, a11, a10, a11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1725553114);
        gradientDrawable.setCornerRadius(q.a(getContext(), 20.0f));
        setBackground(gradientDrawable);
    }

    @Override // com.anythink.basead.ui.ShakeBorderThumbView
    public final int d() {
        return q.a(getContext(), "myoffer_shake_native_border_thumb", "layout");
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setOnShakeListener(final BaseShakeView.a aVar, y yVar) {
        if (yVar != null) {
            this.f11053q = new f.b(yVar.bO());
        }
        ShakeSensorSetting shakeSensorSetting = new ShakeSensorSetting(yVar);
        if (shakeSensorSetting.getShakeWay() != 1 || shakeSensorSetting.getShakeStrengthList() == null || shakeSensorSetting.getShakeStrengthList().size() <= 0) {
            this.f11049m = new SimpleShakeSensorChangeHandler();
        } else {
            this.f11049m = new DuplicateShakeSensorChangeHandler();
        }
        shakeSensorSetting.toString();
        this.f11049m.getClass();
        this.f11049m.initSetting(new ShakeSensorSetting(yVar));
        this.f11049m.setListener(new ATShackSensorListener() { // from class: com.anythink.basead.ui.ShakeNativeBorderThumbView.3
            @Override // com.anythink.basead.handler.ATShackSensorListener
            public final boolean onShakeTrigger() {
                String unused = ShakeNativeBorderThumbView.this.f11052p;
                BaseShakeView.a aVar2 = aVar;
                if (aVar2 != null) {
                    return aVar2.a();
                }
                return false;
            }
        });
        this.f10700k = aVar;
    }

    @Override // com.anythink.basead.ui.ShakeBorderThumbView, com.anythink.basead.ui.BaseShakeView
    public final void a() {
        super.a();
        setBackgroundResource(q.a(t.b().g(), "myoffer_bg_shake_native_border_thumb", k.f20419c));
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public final void b() {
        i.a().a(this.f11051o);
    }
}
