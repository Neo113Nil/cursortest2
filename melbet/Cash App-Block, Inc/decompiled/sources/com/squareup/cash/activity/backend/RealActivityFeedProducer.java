package com.squareup.cash.activity.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.size.DimensionKt;
import com.squareup.cash.activity.backend.ActivityGrouping;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;

/* loaded from: classes5.dex */
public final class RealActivityFeedProducer implements ActivityFeedProducer {
    public final /* synthetic */ int $r8$classId;
    public final AndroidClock clock;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityRowSection.values().length];
            try {
                iArr[ActivityRowSection.DEFAULT_ACTIVITY_ROW_SECTION_DO_NOT_USE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityRowSection.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityRowSection.UPCOMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityRowSection.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ RealActivityFeedProducer(AndroidClock androidClock, int i) {
        this.$r8$classId = i;
        this.clock = androidClock;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014f A[SYNTHETIC] */
    @Override // com.squareup.cash.activity.backend.ActivityFeedProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList produceFeed(Activities activities, List list, int i) {
        Object byOtherMonth;
        Object obj;
        int i2 = this.$r8$classId;
        AndroidClock androidClock = this.clock;
        switch (i2) {
            case 0:
                Iterable iterable = activities.recentActivities;
                if (iterable == null) {
                    iterable = EmptyList.INSTANCE;
                }
                List take = CollectionsKt.take(CollectionsKt.plus(iterable, (Collection) list), i);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : take) {
                    ActivityItem activityItem = (ActivityItem) obj2;
                    ActivityRowSection section = activityItem.getSection();
                    int i3 = section == null ? -1 : WhenMappings.$EnumSwitchMapping$0[section.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            a$$ExternalSyntheticBUOutline0.m(activityItem.getSection(), "Illegal section type ");
                            return null;
                        }
                        if (i3 == 2 || i3 == 3) {
                            ActivityRowSection section2 = activityItem.getSection();
                            section2.getClass();
                            byOtherMonth = new ActivityGrouping.BySection(section2);
                            obj = linkedHashMap.get(byOtherMonth);
                            if (obj != null) {
                                obj = new ArrayList();
                                linkedHashMap.put(byOtherMonth, obj);
                            }
                            ((List) obj).add(obj2);
                        } else if (i3 != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                    }
                    LocalDate localDate = activityItem.getDisplayInstant().atZone(androidClock.timeZone().toZoneId()).toLocalDate();
                    localDate.getClass();
                    if (localDate.equals(DimensionKt.nowLocalDate(androidClock))) {
                        byOtherMonth = ActivityGrouping.ByToday.INSTANCE;
                    } else {
                        LocalDate nowLocalDate = DimensionKt.nowLocalDate(androidClock);
                        byOtherMonth = (localDate.getMonth() == nowLocalDate.getMonth() && localDate.getYear() == nowLocalDate.getYear()) ? ActivityGrouping.ByThisMonth.INSTANCE : new ActivityGrouping.ByOtherMonth(localDate);
                    }
                    obj = linkedHashMap.get(byOtherMonth);
                    if (obj != null) {
                    }
                    ((List) obj).add(obj2);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new ActivityFeedGroup((ActivityGrouping) entry.getKey(), (List) entry.getValue(), null));
                }
                return arrayList;
            default:
                List list2 = list;
                List list3 = activities.recentActivities;
                List take2 = CollectionsKt.take(CollectionsKt.plus(list3 != null ? list3 : EmptyList.INSTANCE, (Collection) list2), i);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : take2) {
                    LocalDate localDate2 = ((ActivityItem) obj3).getDisplayInstant().atZone(androidClock.timeZone().toZoneId()).toLocalDate();
                    localDate2.getClass();
                    ActivityGrouping.ByOtherMonth byOtherMonth2 = new ActivityGrouping.ByOtherMonth(localDate2);
                    Object obj4 = linkedHashMap2.get(byOtherMonth2);
                    if (obj4 == null) {
                        obj4 = new ArrayList();
                        linkedHashMap2.put(byOtherMonth2, obj4);
                    }
                    ((List) obj4).add(obj3);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap2.size());
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    arrayList2.add(new ActivityFeedGroup((ActivityGrouping.ByOtherMonth) entry2.getKey(), (List) entry2.getValue(), null));
                }
                return arrayList2;
        }
    }
}
