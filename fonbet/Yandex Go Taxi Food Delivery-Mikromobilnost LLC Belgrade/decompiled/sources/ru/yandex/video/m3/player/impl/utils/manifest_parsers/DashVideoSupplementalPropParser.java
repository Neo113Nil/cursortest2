package ru.yandex.video.m3.player.impl.utils.manifest_parsers;

import defpackage.a70;
import defpackage.egg;
import defpackage.eyi;
import defpackage.i3y;
import defpackage.sls;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashVideoSupplementalPropParser;", "", "Legg;", "manifest", "<init>", "(Legg;)V", "", "Leyi;", "supplementalProperties$delegate", "Li3y;", "getSupplementalProperties", "()Ljava/util/List;", "supplementalProperties", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DashVideoSupplementalPropParser {
    public static final int $stable = 8;

    /* renamed from: supplementalProperties$delegate, reason: from kotlin metadata */
    private final i3y supplementalProperties;

    public DashVideoSupplementalPropParser(final egg eggVar) {
        this.supplementalProperties = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.utils.manifest_parsers.DashVideoSupplementalPropParser$supplementalProperties$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final List<eyi> invoke() {
                if (egg.this.getPeriodCount() <= 0) {
                    return EmptyList.a;
                }
                List list = egg.this.getPeriod(0).c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((a70) obj).b == 2) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ycc.r(((a70) it.next()).f, arrayList2);
                }
                return arrayList2;
            }
        });
    }

    public final List<eyi> getSupplementalProperties() {
        return (List) this.supplementalProperties.getValue();
    }
}
