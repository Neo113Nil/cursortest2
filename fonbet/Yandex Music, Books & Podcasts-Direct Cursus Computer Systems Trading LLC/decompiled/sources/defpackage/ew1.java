package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ew1 extends AudioDeviceCallback {
    public final /* synthetic */ LinkedHashSet a;
    public final /* synthetic */ ltm b;
    public final /* synthetic */ fw1 c;

    public ew1(LinkedHashSet linkedHashSet, ltm ltmVar, fw1 fw1Var) {
        this.a = linkedHashSet;
        this.b = ltmVar;
        this.c = fw1Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        audioDeviceInfoArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            nx1 a = fw1.a(this.c, audioDeviceInfo);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Set A0 = CollectionsKt.A0(arrayList);
        if (A0.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = this.a;
        z75.t(linkedHashSet, A0);
        ((oc4) this.b).c(CollectionsKt.A0(linkedHashSet));
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        audioDeviceInfoArr.getClass();
        ArrayList arrayList = new ArrayList();
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            nx1 a = fw1.a(this.c, audioDeviceInfo);
            if (a != null) {
                arrayList.add(a);
            }
        }
        Set A0 = CollectionsKt.A0(arrayList);
        if (A0.isEmpty()) {
            return;
        }
        LinkedHashSet linkedHashSet = this.a;
        z75.y(linkedHashSet, A0);
        ((oc4) this.b).c(CollectionsKt.A0(linkedHashSet));
    }
}
