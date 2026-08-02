package ru.yandextaxi.flutter_yandex_mapkit.jni;

import android.util.Log;
import defpackage.g8x;
import defpackage.h8x;
import defpackage.j8x;
import defpackage.ny61;
import defpackage.oyr;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00162\u00020\u0001:\u0002\b\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/jni/JniBinaryMessenger;", "", "<init>", "()V", "Lzy11;", "onMessage", "", "channelId", "Lh8x;", "handler", "setMessageHandler", "(ILh8x;)V", "", "handlers", "Ljava/util/Map;", "", "array", "[B", "Ljava/nio/ByteBuffer;", "kotlin.jvm.PlatformType", "buffer", "Ljava/nio/ByteBuffer;", "Companion", "g8x", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class JniBinaryMessenger {
    public static final int BUFFER_SIZE = 1024;
    public static final g8x Companion = new g8x();
    private static final JniBinaryMessenger instance = new JniBinaryMessenger();
    private final byte[] array;
    private final ByteBuffer buffer;
    private final Map<Integer, h8x> handlers = new LinkedHashMap();

    public JniBinaryMessenger() {
        byte[] bArr = new byte[1024];
        this.array = bArr;
        this.buffer = ByteBuffer.wrap(bArr);
    }

    public static final JniBinaryMessenger getInstance() {
        Companion.getClass();
        return instance;
    }

    private final void onMessage() {
        this.buffer.position(0);
        int i = this.buffer.getInt();
        h8x h8xVar = this.handlers.get(Integer.valueOf(i));
        if (h8xVar != null) {
            ByteBuffer byteBuffer = this.buffer;
            ((j8x) h8xVar).a.a(byteBuffer.getInt(), byteBuffer);
        } else {
            Log.e("jni_binary_messenger", "channel with id: " + i + " not found");
        }
    }

    public final void setMessageHandler(int channelId, h8x handler) {
        Map<Integer, h8x> map = this.handlers;
        if (handler == null) {
            map.remove(Integer.valueOf(channelId));
        } else if (map.containsKey(Integer.valueOf(channelId))) {
            ny61.r(oyr.j(channelId, "channelId: ", " already exists"));
        } else {
            this.handlers.put(Integer.valueOf(channelId), handler);
        }
    }
}
