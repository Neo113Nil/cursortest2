package com.squareup.cash.card.onboarding.core;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class ContouredMarquee {
    public Job decelerationJob;
    public final long frameDelayMs;
    public final Function0 getOffset;
    public boolean initialized;
    public final GLLauncher launcher;
    public Job marqueeJob;
    public final Function0 onFrame;
    public final Function1 setOffset;
    public boolean wasLocked;

    public ContouredMarquee(GLLauncher gLLauncher, Function0 function0, Function1 function1, Function0 function02, long j) {
        gLLauncher.getClass();
        this.launcher = gLLauncher;
        this.getOffset = function0;
        this.setOffset = function1;
        this.onFrame = function02;
        this.frameDelayMs = j;
    }

    public final void setActive(boolean z, boolean z2) {
        Job job;
        if (!z) {
            Job job2 = this.marqueeJob;
            if (job2 != null) {
                job2.cancel(null);
            }
            this.marqueeJob = null;
            Job job3 = this.decelerationJob;
            if (job3 != null) {
                job3.cancel(null);
            }
            this.decelerationJob = null;
            this.initialized = false;
            return;
        }
        boolean z3 = this.initialized;
        GLLauncher gLLauncher = this.launcher;
        if (z3) {
            Function0 function0 = this.getOffset;
            if (z2 && !this.wasLocked) {
                Job job4 = this.marqueeJob;
                if (job4 != null) {
                    job4.cancel(null);
                }
                this.marqueeJob = null;
                Job job5 = this.decelerationJob;
                if (job5 != null) {
                    job5.cancel(null);
                }
                this.decelerationJob = null;
                this.decelerationJob = gLLauncher.launch(new ContouredMarquee$startMarquee$1(this, ((Number) function0.invoke()).floatValue(), null, 1));
            } else if (!z2 && this.wasLocked) {
                float floatValue = ((Number) function0.invoke()).floatValue();
                Job job6 = this.marqueeJob;
                if (job6 == null || !job6.isActive()) {
                    Job job7 = this.decelerationJob;
                    if (job7 != null) {
                        job7.cancel(null);
                    }
                    this.decelerationJob = null;
                    this.marqueeJob = gLLauncher.launch(new ContouredMarquee$startMarquee$1(this, floatValue, null, 0));
                }
            }
        } else if (!z2 && ((job = this.marqueeJob) == null || !job.isActive())) {
            Job job8 = this.decelerationJob;
            if (job8 != null) {
                job8.cancel(null);
            }
            this.decelerationJob = null;
            this.marqueeJob = gLLauncher.launch(new ContouredMarquee$startMarquee$1(this, RecyclerView.DECELERATION_RATE, null, 0));
        }
        this.wasLocked = z2;
        this.initialized = true;
    }
}
