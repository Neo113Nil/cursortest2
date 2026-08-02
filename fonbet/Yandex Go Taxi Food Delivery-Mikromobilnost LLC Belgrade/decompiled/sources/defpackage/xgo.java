package defpackage;

import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class xgo implements yvf0 {
    public final /* synthetic */ int a;
    public final yvf0 b;

    public /* synthetic */ xgo(yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) yvf0Var.get()).getPackageName();
                if (packageName == null) {
                    ny61.t("Cannot return null from a non-@Nullable @Provides method");
                    break;
                } else {
                    break;
                }
            default:
                s3c s3cVar = (s3c) yvf0Var.get();
                SchedulerConfig.a aVar = new SchedulerConfig.a();
                Priority priority = Priority.DEFAULT;
                b bVar = new b();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    ny61.t("Null flags");
                    break;
                } else {
                    bVar.c = set;
                    bVar.a = 30000L;
                    bVar.b = 86400000L;
                    aVar.b.put(priority, bVar.a());
                    Priority priority2 = Priority.HIGHEST;
                    b bVar2 = new b();
                    if (set == null) {
                        ny61.t("Null flags");
                        break;
                    } else {
                        bVar2.c = set;
                        bVar2.a = 1000L;
                        bVar2.b = 86400000L;
                        aVar.b.put(priority2, bVar2.a());
                        Priority priority3 = Priority.VERY_LOW;
                        b bVar3 = new b();
                        if (set == null) {
                            ny61.t("Null flags");
                            break;
                        } else {
                            bVar3.c = set;
                            bVar3.a = 86400000L;
                            bVar3.b = 86400000L;
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.DEVICE_IDLE)));
                            if (unmodifiableSet == null) {
                                ny61.t("Null flags");
                                break;
                            } else {
                                bVar3.c = unmodifiableSet;
                                aVar.b.put(priority3, bVar3.a());
                                aVar.a = s3cVar;
                                if (s3cVar == null) {
                                    ny61.t("missing required property: clock");
                                    break;
                                } else if (aVar.b.keySet().size() < Priority.values().length) {
                                    ny61.r("Not all priorities have been configured");
                                    break;
                                } else {
                                    HashMap hashMap = aVar.b;
                                    aVar.b = new HashMap();
                                    break;
                                }
                            }
                        }
                    }
                }
        }
        return null;
    }
}
