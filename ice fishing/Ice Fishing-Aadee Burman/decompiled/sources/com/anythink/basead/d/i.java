package com.anythink.basead.d;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.anythink.basead.handler.ATShackSensorListener;
import com.anythink.basead.handler.DuplicateShakeSensorChangeHandler;
import com.anythink.basead.handler.IShackSensorChangeHandler;
import com.anythink.basead.handler.ShakeSensorSetting;
import com.anythink.basead.handler.SimpleShakeSensorChangeHandler;
import com.anythink.core.common.h.y;

/* loaded from: classes.dex */
public abstract class i implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    final String f6203a = "ShakeEventListenerImpl";

    /* renamed from: b, reason: collision with root package name */
    IShackSensorChangeHandler f6204b;

    public final void a(y yVar) {
        ShakeSensorSetting shakeSensorSetting = new ShakeSensorSetting(yVar);
        if (shakeSensorSetting.getShakeWay() != 1 || shakeSensorSetting.getShakeStrengthList() == null || shakeSensorSetting.getShakeStrengthList().size() <= 0) {
            this.f6204b = new SimpleShakeSensorChangeHandler();
        } else {
            this.f6204b = new DuplicateShakeSensorChangeHandler();
        }
        shakeSensorSetting.toString();
        this.f6204b.getClass();
        this.f6204b.initSetting(new ShakeSensorSetting(yVar));
        this.f6204b.setListener(new ATShackSensorListener() { // from class: com.anythink.basead.d.i.1
            @Override // com.anythink.basead.handler.ATShackSensorListener
            public final boolean onShakeTrigger() {
                return i.this.a();
            }
        });
    }

    public abstract boolean a();

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        IShackSensorChangeHandler iShackSensorChangeHandler = this.f6204b;
        if (iShackSensorChangeHandler != null) {
            iShackSensorChangeHandler.handleSensorData(sensorEvent);
        }
    }
}
