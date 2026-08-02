package ru.yandex.taxi.jobs.push;

import ru.yandex.taxi.jobs.push.ToggleJobsExperiment;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ToggleJobsExperiment.StateDto.values().length];
        try {
            iArr[ToggleJobsExperiment.StateDto.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToggleJobsExperiment.StateDto.SCHEDULE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ToggleJobsExperiment.StateDto.PERIODIC_SCHEDULE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ToggleJobsExperiment.StateDto.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
