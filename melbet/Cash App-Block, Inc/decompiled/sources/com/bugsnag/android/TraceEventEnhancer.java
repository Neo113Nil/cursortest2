package com.bugsnag.android;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class TraceEventEnhancer implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final Logger logger;
    public final Object projectPackages;

    public TraceEventEnhancer(Logger logger, boolean z, boolean z2) {
        this.logger = logger;
        this.projectPackages = new TombstoneParser(logger, z, z2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Logger logger = this.logger;
        int i2 = 0;
        Object obj3 = this.projectPackages;
        switch (i) {
            case 0:
                Event event = (Event) obj;
                try {
                    InputStream traceInputStream = a$$ExternalSyntheticBUOutline0.m(obj2).getTraceInputStream();
                    if (traceInputStream != null) {
                        try {
                            TraceParser traceParser = new TraceParser(logger, (Collection) obj3);
                            ArrayList arrayList = new ArrayList();
                            traceParser.parse(traceInputStream, new TraceEventEnhancer$invoke$1$1(0, arrayList));
                            event.impl.threads.clear();
                            event.impl.threads.addAll(arrayList);
                            traceInputStream.close();
                        } finally {
                        }
                    }
                } catch (Exception e) {
                    logger.w("could not parse trace file", e);
                }
                return Unit.INSTANCE;
            default:
                Event event2 = (Event) obj;
                try {
                    InputStream traceInputStream2 = a$$ExternalSyntheticBUOutline0.m(obj2).getTraceInputStream();
                    if (traceInputStream2 != null) {
                        ((TombstoneParser) obj3).parse(traceInputStream2, new TombstoneEventEnhancer$invoke$1(this, event2), new TombstoneEventEnhancer$invoke$2(event2, i2), new TombstoneEventEnhancer$invoke$1(event2, 1), new TombstoneEventEnhancer$invoke$1(event2, 2));
                    }
                } catch (Exception e2) {
                    logger.w("could not parse tombstone file", e2);
                }
                return Unit.INSTANCE;
        }
    }

    public TraceEventEnhancer(Logger logger, Collection collection) {
        this.logger = logger;
        this.projectPackages = collection;
    }
}
