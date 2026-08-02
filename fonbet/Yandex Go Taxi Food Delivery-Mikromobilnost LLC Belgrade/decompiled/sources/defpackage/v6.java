package defpackage;

import com.twilio.audioswitch.AbstractAudioSwitch$State;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class v6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[AbstractAudioSwitch$State.values().length];
        a = iArr;
        AbstractAudioSwitch$State abstractAudioSwitch$State = AbstractAudioSwitch$State.STOPPED;
        iArr[abstractAudioSwitch$State.ordinal()] = 1;
        int[] iArr2 = new int[AbstractAudioSwitch$State.values().length];
        AbstractAudioSwitch$State abstractAudioSwitch$State2 = AbstractAudioSwitch$State.ACTIVATED;
        iArr2[abstractAudioSwitch$State2.ordinal()] = 1;
        AbstractAudioSwitch$State abstractAudioSwitch$State3 = AbstractAudioSwitch$State.STARTED;
        iArr2[abstractAudioSwitch$State3.ordinal()] = 2;
        iArr2[abstractAudioSwitch$State.ordinal()] = 3;
        int[] iArr3 = new int[AbstractAudioSwitch$State.values().length];
        b = iArr3;
        iArr3[abstractAudioSwitch$State3.ordinal()] = 1;
        iArr3[abstractAudioSwitch$State2.ordinal()] = 2;
        iArr3[abstractAudioSwitch$State.ordinal()] = 3;
        int[] iArr4 = new int[AbstractAudioSwitch$State.values().length];
        c = iArr4;
        iArr4[abstractAudioSwitch$State2.ordinal()] = 1;
        iArr4[abstractAudioSwitch$State3.ordinal()] = 2;
        iArr4[abstractAudioSwitch$State.ordinal()] = 3;
    }
}
