package com.anythink.basead.exoplayer.b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7218a = new c(new int[]{2}, 2);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7219b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7220c;

    private c(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f7219b = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f7219b = new int[0];
        }
        this.f7220c = i;
    }

    public static c a(Context context) {
        return a(context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f7219b, cVar.f7219b) && this.f7220c == cVar.f7220c;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f7219b) * 31) + this.f7220c;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f7220c + ", supportedEncodings=" + Arrays.toString(this.f7219b) + "]";
    }

    public static c a(Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new c(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 0));
        }
        return f7218a;
    }

    public final boolean a(int i) {
        return Arrays.binarySearch(this.f7219b, i) >= 0;
    }

    private int a() {
        return this.f7220c;
    }
}
