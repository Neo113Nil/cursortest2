package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class p9l {
    public long a;
    public mqs b;
    public q9l c;
    public long d;
    public final /* synthetic */ nwh e;

    public p9l(nwh nwhVar) {
        this.e = nwhVar;
    }

    public final void a() {
        mqs mqsVar = this.b;
        if (mqsVar == null || this.c != q9l.c) {
            return;
        }
        this.c = q9l.d;
        this.a = System.currentTimeMillis();
        nmb nmbVar = (nmb) this.e.h;
        String str = mqsVar.a;
        String str2 = mqsVar.c;
        boolean o = mqsVar.o();
        hqs hqsVar = mqsVar.o;
        boolean z = false;
        if (hqsVar != null && hqsVar.b) {
            z = true;
        }
        nmbVar.getClass();
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str);
        eta.u(linkedHashMap, "track_name", str2, o, "with_videoshot");
        linkedHashMap.put("with_animated_text", String.valueOf(true));
        linkedHashMap.put("videoshot_on", String.valueOf(z));
        linkedHashMap.put("animated_text_on", String.valueOf(true));
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("ExpandedPlayer.AnimatedText.VideoStarted", linkedHashMap);
    }

    public final void b() {
        mqs mqsVar = this.b;
        if (mqsVar == null || this.c != q9l.d) {
            return;
        }
        this.c = q9l.c;
        this.d = (System.currentTimeMillis() - this.a) + this.d;
        nwh nwhVar = this.e;
        nmb nmbVar = (nmb) nwhVar.h;
        String str = mqsVar.a;
        String str2 = mqsVar.c;
        boolean o = mqsVar.o();
        boolean booleanValue = ((Boolean) ((vdr) nwhVar.b).getValue()).booleanValue();
        int i = (int) this.d;
        nmbVar.getClass();
        str.getClass();
        str2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_type", "object");
        linkedHashMap.put("track_id", str);
        eta.u(linkedHashMap, "track_name", str2, o, "with_videoshot");
        linkedHashMap.put("with_animated_text", String.valueOf(true));
        linkedHashMap.put("videoshot_on", String.valueOf(booleanValue));
        linkedHashMap.put("animated_text_on", String.valueOf(true));
        linkedHashMap.put("watched_time", String.valueOf(i));
        linkedHashMap.put("_meta", nmb.u(1));
        nmbVar.C("ExpandedPlayer.AnimatedText.VideoWatched", linkedHashMap);
    }
}
