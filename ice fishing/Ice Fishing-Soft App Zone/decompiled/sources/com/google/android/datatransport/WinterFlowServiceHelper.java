package com.google.android.datatransport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceHelper {
    public static final HashMap WinterFlowVariableVersionControl = new HashMap();
    public FileChannel WinterFlowArrayNetwork;
    public final Lock WinterFlowCacheManagerAgent;
    public final File WinterFlowHookDataSource;
    public final boolean WinterFlowRouterStructure;

    public WinterFlowServiceHelper(String str, File file, boolean z) {
        Lock lock;
        this.WinterFlowRouterStructure = z;
        this.WinterFlowHookDataSource = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap hashMap = WinterFlowVariableVersionControl;
        synchronized (hashMap) {
            try {
                Object obj = hashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    hashMap.put(str, obj);
                }
                lock = (Lock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.WinterFlowCacheManagerAgent = lock;
    }

    public final void WinterFlowHookDataSource() {
        try {
            FileChannel fileChannel = this.WinterFlowArrayNetwork;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.WinterFlowCacheManagerAgent.unlock();
    }

    public final void WinterFlowRouterStructure(boolean z) {
        this.WinterFlowCacheManagerAgent.lock();
        if (z) {
            File file = this.WinterFlowHookDataSource;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.WinterFlowArrayNetwork = channel;
            } catch (IOException unused) {
                this.WinterFlowArrayNetwork = null;
            }
        }
    }
}
