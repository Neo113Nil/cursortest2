package defpackage;

import android.text.format.DateFormat;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.transport.masstransit.Estimation;
import com.yandex.mapkit.transport.masstransit.LineAtStop;
import com.yandex.mapkit.transport.masstransit.Periodical;
import com.yandex.mapkit.transport.masstransit.Schedule;
import com.yandex.mapkit.transport.masstransit.Scheduled;
import com.yandex.mapkit.transport.masstransit.ThreadAtStop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.sequences.b;

/* loaded from: classes6.dex */
public final class yy30 {
    public final ole0 a;

    public yy30(ole0 ole0Var) {
        this.a = ole0Var;
    }

    public final List a(h73 h73Var, long j) {
        return b.s(new yw01(new e2k(2, new e2k(0, b.g(b.i(h73Var), new vh10(j, 12)), new vh10(j, 13)), new xy30()), new ft20(26, this)));
    }

    public final wy30 b(LineAtStop lineAtStop, ThreadAtStop threadAtStop, long j) {
        List<Estimation> estimations;
        Estimation estimation;
        String vehicleId;
        List<Estimation> estimations2;
        List<Estimation> estimations3;
        Object obj;
        Schedule schedule = threadAtStop.getSchedule();
        Schedule.ScheduleEntry scheduleEntry = (Schedule.ScheduleEntry) a.R(schedule.getScheduleEntries());
        if (scheduleEntry != null) {
            String id = threadAtStop.getThread().getId();
            Periodical periodical = scheduleEntry.getPeriodical();
            if (periodical == null || (estimations2 = periodical.getEstimations()) == null || !(!estimations2.isEmpty())) {
                Scheduled scheduled = scheduleEntry.getScheduled();
                if ((scheduled != null ? scheduled.getEstimation() : null) != null) {
                    Scheduled scheduled2 = scheduleEntry.getScheduled();
                    if (scheduled2 != null && (estimation = scheduled2.getEstimation()) != null && (vehicleId = estimation.getVehicleId()) != null) {
                        return new ty30(lineAtStop.getLine().getId(), id, c(lineAtStop, j), vehicleId);
                    }
                } else {
                    Periodical periodical2 = scheduleEntry.getPeriodical();
                    if (periodical2 != null && (estimations = periodical2.getEstimations()) != null && estimations.isEmpty()) {
                        Periodical periodical3 = scheduleEntry.getPeriodical();
                        if (periodical3 != null) {
                            String id2 = lineAtStop.getLine().getId();
                            String text = periodical3.getFrequency().getText();
                            double value = periodical3.getFrequency().getValue();
                            Time begin = periodical3.getBegin();
                            n940 d = begin != null ? d(begin) : null;
                            Time end = periodical3.getEnd();
                            return new uy30(id2, id, text, value, d, end != null ? d(end) : null);
                        }
                    } else if (scheduleEntry.getScheduled() != null) {
                        String id3 = lineAtStop.getLine().getId();
                        List<Schedule.ScheduleEntry> scheduleEntries = schedule.getScheduleEntries();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it = scheduleEntries.iterator();
                        while (it.hasNext()) {
                            Scheduled scheduled3 = ((Schedule.ScheduleEntry) it.next()).getScheduled();
                            Time arrivalTime = scheduled3 != null ? scheduled3.getArrivalTime() : null;
                            if (arrivalTime != null) {
                                arrayList.add(arrivalTime);
                            }
                        }
                        List<Schedule.ScheduleEntry> scheduleEntries2 = schedule.getScheduleEntries();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = scheduleEntries2.iterator();
                        while (it2.hasNext()) {
                            Scheduled scheduled4 = ((Schedule.ScheduleEntry) it2.next()).getScheduled();
                            Time departureTime = scheduled4 != null ? scheduled4.getDepartureTime() : null;
                            if (departureTime != null) {
                                arrayList2.add(departureTime);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = arrayList2;
                        }
                        return new vy30(id3, id, a(new h73(1, arrayList), j));
                    }
                }
            } else {
                Periodical periodical4 = scheduleEntry.getPeriodical();
                if (periodical4 != null && (estimations3 = periodical4.getEstimations()) != null) {
                    Iterator<T> it3 = estimations3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it3.next();
                        Estimation estimation2 = (Estimation) obj;
                        if (estimation2.getArrivalTime() != null && estimation2.getVehicleId() != null) {
                            break;
                        }
                    }
                    Estimation estimation3 = (Estimation) obj;
                    if (estimation3 != null) {
                        String id4 = lineAtStop.getLine().getId();
                        List c = c(lineAtStop, j);
                        String vehicleId2 = estimation3.getVehicleId();
                        if (vehicleId2 != null) {
                            return new ty30(id4, id, c, vehicleId2);
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public final List c(LineAtStop lineAtStop, long j) {
        Time time;
        List<Estimation> estimations;
        Periodical a = jgy.a(lineAtStop);
        ?? r1 = EmptyList.a;
        if (a != null) {
            Periodical a2 = jgy.a(lineAtStop);
            if (a2 != null && (estimations = a2.getEstimations()) != null) {
                List<Estimation> list = estimations;
                r1 = new ArrayList(tcc.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    r1.add(((Estimation) it.next()).getArrivalTime());
                }
            }
        } else if (jgy.c(lineAtStop) != null) {
            ArrayList b = jgy.b(lineAtStop);
            r1 = new ArrayList();
            Iterator it2 = b.iterator();
            while (it2.hasNext()) {
                Scheduled scheduled = ((Schedule.ScheduleEntry) it2.next()).getScheduled();
                if (scheduled != null) {
                    Estimation estimation = scheduled.getEstimation();
                    if ((estimation == null || (time = estimation.getArrivalTime()) == null) && (time = scheduled.getArrivalTime()) == null) {
                        time = scheduled.getDepartureTime();
                    }
                } else {
                    time = null;
                }
                if (time != null) {
                    r1.add(time);
                }
            }
        }
        return a(new h73(1, (Iterable) r1), j);
    }

    public final n940 d(Time time) {
        return new n940(time.getValue(), npb1.e(time, DateFormat.getTimeFormat(this.a.a), 0L));
    }
}
