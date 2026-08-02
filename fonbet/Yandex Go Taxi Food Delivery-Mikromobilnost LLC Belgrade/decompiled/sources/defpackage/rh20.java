package defpackage;

import com.yandex.messaging.miniapps.js.ChannelEventType;

/* loaded from: classes15.dex */
public abstract class rh20 {
    public final ChannelEventType a;
    public final boolean b;
    public final String c;
    public final boolean d;

    public rh20(ChannelEventType channelEventType, boolean z, String str) {
        this.a = channelEventType;
        this.b = z;
        this.c = str;
        this.d = str != null;
    }

    public abstract void a(dqv dqvVar);

    public /* synthetic */ rh20(ChannelEventType channelEventType) {
        this(channelEventType, false, null);
    }
}
