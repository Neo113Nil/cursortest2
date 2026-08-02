package androidx.media3.common.util;

import android.os.Handler;
import android.os.Message;
import androidx.tracing.Trace;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class SystemHandlerWrapper {
    public static final ArrayList messagePool = new ArrayList(50);
    public final Handler handler;

    public final class SystemMessage {
        public Message message;

        public final void recycle() {
            this.message = null;
            ArrayList arrayList = SystemHandlerWrapper.messagePool;
            synchronized (arrayList) {
                try {
                    if (arrayList.size() < 50) {
                        arrayList.add(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void sendToTarget() {
            Message message = this.message;
            message.getClass();
            message.sendToTarget();
            recycle();
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    public static SystemMessage obtainSystemMessage() {
        SystemMessage systemMessage;
        ArrayList arrayList = messagePool;
        synchronized (arrayList) {
            try {
                systemMessage = arrayList.isEmpty() ? new SystemMessage() : (SystemMessage) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return systemMessage;
    }

    public final SystemMessage obtainMessage(int i) {
        SystemMessage obtainSystemMessage = obtainSystemMessage();
        obtainSystemMessage.message = this.handler.obtainMessage(i);
        return obtainSystemMessage;
    }

    public final void post(Runnable runnable) {
        this.handler.post(runnable);
    }

    public final void removeMessages(int i) {
        Trace.checkArgument(i != 0);
        this.handler.removeMessages(i);
    }

    public final void sendEmptyMessage(int i) {
        this.handler.sendEmptyMessage(i);
    }

    public final SystemMessage obtainMessage(int i, Object obj) {
        SystemMessage obtainSystemMessage = obtainSystemMessage();
        obtainSystemMessage.message = this.handler.obtainMessage(i, obj);
        return obtainSystemMessage;
    }

    public final SystemMessage obtainMessage(int i, int i2, int i3) {
        SystemMessage obtainSystemMessage = obtainSystemMessage();
        obtainSystemMessage.message = this.handler.obtainMessage(i, i2, i3);
        return obtainSystemMessage;
    }
}
