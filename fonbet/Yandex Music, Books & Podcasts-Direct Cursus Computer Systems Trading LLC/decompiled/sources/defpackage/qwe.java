package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class qwe implements ove {
    public final yjj a;

    public qwe(paw pawVar, yjj yjjVar, yjj yjjVar2) {
        this.a = yjjVar;
    }

    @Override // defpackage.ove
    public final void D() {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).D();
        }
    }

    @Override // defpackage.ove
    public final void E() {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).E();
        }
    }

    @Override // defpackage.ove
    public final void G(VideoData videoData, boolean z) {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).h0(videoData);
        }
    }

    @Override // defpackage.ove
    public final void a() {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).a();
        }
    }

    @Override // defpackage.ove
    public final void f() {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).f();
        }
    }

    @Override // defpackage.ove
    public final void w() {
        HashSet u0;
        yjj yjjVar = this.a;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            ((rgl) it.next()).w();
        }
    }
}
