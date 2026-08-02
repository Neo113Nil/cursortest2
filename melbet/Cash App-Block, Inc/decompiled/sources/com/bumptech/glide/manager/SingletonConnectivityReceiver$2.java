package com.bumptech.glide.manager;

import androidx.camera.video.VideoCapture;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class SingletonConnectivityReceiver$2 implements ConnectivityMonitor.ConnectivityListener {
    public final /* synthetic */ VideoCapture.AnonymousClass3 this$0;

    public SingletonConnectivityReceiver$2(VideoCapture.AnonymousClass3 anonymousClass3) {
        this.this$0 = anonymousClass3;
    }

    @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
    public final void onConnectivityChanged(boolean z) {
        ArrayList arrayList;
        Util.assertMainThread();
        synchronized (this.this$0) {
            arrayList = new ArrayList((HashSet) this.this$0.this$0);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ConnectivityMonitor.ConnectivityListener) it.next()).onConnectivityChanged(z);
        }
    }
}
