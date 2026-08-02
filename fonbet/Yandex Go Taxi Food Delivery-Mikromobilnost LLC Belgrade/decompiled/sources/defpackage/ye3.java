package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes10.dex */
public final class ye3 {
    public static final ye3 c = new ye3(ImmutableList.r(xe3.d));
    public static final ImmutableList d = ImmutableList.t(2, 5, 6);
    public static final ImmutableMap e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        ImmutableMap.a aVar = new ImmutableMap.a();
        aVar.b(5, 6);
        aVar.b(17, 6);
        aVar.b(7, 6);
        aVar.b(30, 10);
        aVar.b(18, 6);
        aVar.b(6, 8);
        aVar.b(8, 8);
        aVar.b(14, 8);
        e = aVar.a();
    }

    public ye3(List list) {
        for (int i = 0; i < list.size(); i++) {
            xe3 xe3Var = (xe3) list.get(i);
            this.a.put(xe3Var.a, xe3Var);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a.size(); i3++) {
            i2 = Math.max(i2, ((xe3) this.a.valueAt(i3)).b);
        }
        this.b = i2;
    }

    public static ImmutableList a(int i, int[] iArr) {
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i2 : iArr) {
            aVar.a(new xe3(i2, i));
        }
        return aVar.g();
    }

    public static ye3 b(Context context, ue3 ue3Var, ddf ddfVar) {
        return c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ue3Var, ddfVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x024d, code lost:
    
        if (r4.equals("Xiaomi") == false) goto L98;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ye3 c(Context context, Intent intent, ue3 ue3Var, ddf ddfVar) {
        ddf ddfVar2;
        List audioDevicesForAttributes;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        AudioManager i = eg3.i(context);
        if (ddfVar != null) {
            ddfVar2 = ddfVar;
        } else {
            ddfVar2 = null;
            if (tw21.a >= 33) {
                try {
                    audioDevicesForAttributes = i.getAudioDevicesForAttributes(ue3Var.a().a);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        ddfVar2 = new ddf(22, (AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
        int i2 = tw21.a;
        ImmutableMap immutableMap = e;
        if (i2 >= 33 && (tw21.U(context) || (i2 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            directProfilesForAttributes = i.getDirectProfilesForAttributes(ue3Var.a().a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(a.a(12)));
            for (int i3 = 0; i3 < directProfilesForAttributes.size(); i3++) {
                AudioProfile j = hl1.j(directProfilesForAttributes.get(i3));
                encapsulationType = j.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = j.getFormat();
                    if (tw21.R(format) || immutableMap.containsKey(Integer.valueOf(format))) {
                        if (hashMap.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) hashMap.get(Integer.valueOf(format));
                            set.getClass();
                            channelMasks2 = j.getChannelMasks();
                            set.addAll(a.a(channelMasks2));
                        } else {
                            Integer valueOf = Integer.valueOf(format);
                            channelMasks = j.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(a.a(channelMasks)));
                        }
                    }
                }
            }
            piv pivVar = ImmutableList.b;
            ImmutableList.a aVar = new ImmutableList.a();
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.a(new xe3(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new ye3(aVar.g());
        }
        if (i2 >= 23) {
            AudioDeviceInfo[] devices = ddfVar2 == null ? i.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) ddfVar2.b};
            ImmutableSet.a aVar2 = new ImmutableSet.a();
            Integer[] numArr = {8, 7};
            if (aVar2.d != null) {
                for (int i4 = 0; i4 < 2; i4++) {
                    aVar2.g(numArr[i4]);
                }
            } else {
                aVar2.b(numArr);
            }
            if (i2 >= 31) {
                Integer[] numArr2 = {26, 27};
                if (aVar2.d != null) {
                    for (int i5 = 0; i5 < 2; i5++) {
                        aVar2.g(numArr2[i5]);
                    }
                } else {
                    aVar2.b(numArr2);
                }
            }
            if (i2 >= 33) {
                aVar2.g(30);
            }
            ImmutableSet i6 = aVar2.i();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (i6.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return c;
                }
            }
        }
        ImmutableSet.a aVar3 = new ImmutableSet.a();
        aVar3.g(2);
        int i7 = tw21.a;
        if (i7 >= 29 && (tw21.U(context) || (i7 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            piv pivVar2 = ImmutableList.b;
            ImmutableList.a aVar4 = new ImmutableList.a();
            h221 it = immutableMap.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (tw21.a >= tw21.q(intValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), ue3Var.a().a)) {
                    aVar4.a(num);
                }
            }
            aVar4.a(2);
            aVar3.h(aVar4.g());
            return new ye3(a(10, a.e(aVar3.i())));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon")) {
            }
        }
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar3.h(d);
        }
        if (intent == null || z || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new ye3(a(10, a.e(aVar3.i())));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar3.h(a.a(intArrayExtra));
        }
        return new ye3(a(intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10), a.e(aVar3.i())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r11 != 5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair d(androidx.media3.common.a aVar, ue3 ue3Var) {
        int s;
        String str = aVar.n;
        str.getClass();
        int d2 = eh20.d(str, aVar.k);
        Integer valueOf = Integer.valueOf(d2);
        ImmutableMap immutableMap = e;
        if (!immutableMap.containsKey(valueOf)) {
            return null;
        }
        int i = 6;
        SparseArray sparseArray = this.a;
        if (d2 == 18 && !tw21.k(sparseArray, 18)) {
            d2 = 6;
        } else if ((d2 == 8 && !tw21.k(sparseArray, 8)) || (d2 == 30 && !tw21.k(sparseArray, 30))) {
            d2 = 7;
        }
        if (!tw21.k(sparseArray, d2)) {
            return null;
        }
        xe3 xe3Var = (xe3) sparseArray.get(d2);
        xe3Var.getClass();
        int i2 = xe3Var.b;
        ImmutableSet immutableSet = xe3Var.c;
        int i3 = aVar.D;
        boolean z = false;
        if (i3 == -1 || d2 == 18) {
            int i4 = aVar.E;
            if (i4 == -1) {
                i4 = 48000;
            }
            int i5 = xe3Var.a;
            if (immutableSet == null) {
                if (tw21.a >= 29) {
                    i2 = 10;
                    while (true) {
                        if (i2 <= 0) {
                            i2 = 0;
                            break;
                        }
                        int s2 = tw21.s(i2);
                        if (s2 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i5).setSampleRate(i4).setChannelMask(s2).build(), ue3Var.a().a)) {
                            break;
                        }
                        i2--;
                    }
                } else {
                    Object obj = immutableMap.get(Integer.valueOf(i5));
                    i2 = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i3 = i2;
        } else if (!aVar.n.equals("audio/vnd.dts.uhd;profile=p2") || tw21.a >= 33) {
            if (immutableSet != null) {
                int s3 = tw21.s(i3);
                if (s3 != 0) {
                    z = immutableSet.contains(Integer.valueOf(s3));
                }
            } else if (i3 <= i2) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i3 > 10) {
            return null;
        }
        int i6 = tw21.a;
        if (i6 <= 28) {
            if (i3 == 7) {
                i = 8;
            } else if (i3 != 3) {
                if (i3 != 4) {
                }
            }
            if (i6 <= 26 && "fugu".equals(Build.DEVICE) && i == 1) {
                i = 2;
            }
            s = tw21.s(i);
            if (s != 0) {
                return null;
            }
            return Pair.create(Integer.valueOf(d2), Integer.valueOf(s));
        }
        i = i3;
        if (i6 <= 26) {
            i = 2;
        }
        s = tw21.s(i);
        if (s != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean contentEquals;
        if (this != obj) {
            if (obj instanceof ye3) {
                ye3 ye3Var = (ye3) obj;
                SparseArray sparseArray = ye3Var.a;
                int i = tw21.a;
                SparseArray sparseArray2 = this.a;
                if (sparseArray2 != null) {
                    if (sparseArray != null) {
                        if (tw21.a >= 31) {
                            contentEquals = sparseArray2.contentEquals(sparseArray);
                        } else {
                            int size = sparseArray2.size();
                            if (size == sparseArray.size()) {
                                for (int i2 = 0; i2 < size; i2++) {
                                    if (Objects.equals(sparseArray2.valueAt(i2), sparseArray.get(sparseArray2.keyAt(i2)))) {
                                    }
                                }
                                contentEquals = true;
                            }
                        }
                    }
                    contentEquals = false;
                    break;
                }
                if (!contentEquals || this.b != ye3Var.b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = tw21.a;
        SparseArray sparseArray = this.a;
        if (i2 >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            i = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                i = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (i * 31)) * 31);
            }
        }
        return (i * 31) + this.b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.b + ", audioProfiles=" + this.a + "]";
    }
}
