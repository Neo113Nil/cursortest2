package com.connectsdk.service.webos.lgcast.common.utils;

import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes.dex */
public class TimerUtil {

    public interface TimerListener {
        void onTime();
    }

    public static Timer schedule(final TimerListener timerListener, long j, long j2) {
        Timer timer = new Timer("TimerUtil");
        timer.schedule(new TimerTask() { // from class: com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                TimerListener timerListener2 = TimerListener.this;
                if (timerListener2 != null) {
                    timerListener2.onTime();
                }
            }
        }, j, j2);
        return timer;
    }

    public static Timer schedule(final TimerListener timerListener, long j) {
        Timer timer = new Timer("TimerUtil");
        timer.schedule(new TimerTask() { // from class: com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                TimerListener timerListener2 = TimerListener.this;
                if (timerListener2 != null) {
                    timerListener2.onTime();
                }
            }
        }, j);
        return timer;
    }
}
