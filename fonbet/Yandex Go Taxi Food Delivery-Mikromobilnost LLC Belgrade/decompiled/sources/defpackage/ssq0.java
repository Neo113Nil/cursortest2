package defpackage;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.SpannableString;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.ConstructionSegment;
import com.yandex.mapkit.transport.masstransit.Pass;
import com.yandex.mapkit.transport.masstransit.Stairs;
import com.yandex.mapkit.transport.masstransit.Stop;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.mapkit.transport.masstransit.WayPoint;
import com.yandex.mapkit.transport.masstransit.Weight;
import com.yandex.runtime.KeyValuePair;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes15.dex */
public abstract class ssq0 {
    public static final LinkedHashMap a(List list) {
        List<KeyValuePair> list2 = list;
        int d = gw00.d(tcc.n(list2, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (KeyValuePair keyValuePair : list2) {
            Pair pair = new Pair(keyValuePair.getKey(), keyValuePair.getValue());
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    public static final Map b(SpannableString spannableString) {
        Pair pair = new Pair("text", spannableString.getText());
        List<SpannableString.Span> spans = spannableString.getSpans();
        ArrayList arrayList = new ArrayList(tcc.n(spans, 10));
        for (SpannableString.Span span : spans) {
            arrayList.add(b.i(new Pair("begin", Integer.valueOf(span.getBegin())), new Pair("end", Integer.valueOf(span.getEnd()))));
        }
        return b.i(pair, new Pair("spans", arrayList));
    }

    public static final Map c(ConstructionSegment constructionSegment) {
        ConstructionMask constructionMask = constructionSegment.getConstructionMask();
        Stairs stairs = constructionMask.getStairs();
        Pair pair = new Pair("stairs", stairs != null ? b.i(new Pair("direction", stairs.getDirection().name().toLowerCase(Locale.ROOT)), new Pair("hasRamp", Boolean.valueOf(stairs.getHasRamp()))) : null);
        Pass pass = constructionMask.getPass();
        return b.i(new Pair("construction", b.i(pair, new Pair("pass", pass != null ? pass.name().toLowerCase(Locale.ROOT) : null), new Pair("crosswalk", Boolean.valueOf(constructionMask.getCrosswalk())), new Pair("binding", Boolean.valueOf(constructionMask.getBinding())), new Pair("transition", Boolean.valueOf(constructionMask.getTransition())), new Pair("tunnel", Boolean.valueOf(constructionMask.getTunnel())), new Pair("travolator", constructionMask.getTravolator()), new Pair("indoor", Boolean.valueOf(constructionMask.getIndoor())))), new Pair("subpolyline", rsq0.n(constructionSegment.getSubpolyline())));
    }

    public static final Map d(Stop stop) {
        return b.i(new Pair("id", stop.getId()), new Pair("name", stop.getName()), new Pair("additionalName", stop.getAdditionalName()));
    }

    public static final Map e(TravelEstimation travelEstimation) {
        return b.i(new Pair("departureTime", rsq0.o(travelEstimation.getDepartureTime())), new Pair("arrivalTime", rsq0.o(travelEstimation.getArrivalTime())));
    }

    public static final Map f(WayPoint wayPoint) {
        return b.i(new Pair("position", rsq0.i(wayPoint.getPosition())), new Pair("selectedArrivalPosition", wayPoint.getSelectedArrivalPoint() != null ? rsq0.i(wayPoint.getSelectedArrivalPoint()) : null), new Pair("selectedDeparturePoint", wayPoint.getSelectedDeparturePoint() != null ? rsq0.i(wayPoint.getSelectedDeparturePoint()) : null), new Pair("context", wayPoint.getContext()));
    }

    public static final Map g(Weight weight) {
        LocalizedValue time = weight.getTime();
        Pair pair = new Pair(RemoteBioParameters.TIME, b.i(new Pair("value", Double.valueOf(time.getValue())), new Pair("text", time.getText())));
        LocalizedValue walkingDistance = weight.getWalkingDistance();
        return b.i(pair, new Pair("walkingDistance", b.i(new Pair("value", Double.valueOf(walkingDistance.getValue())), new Pair("text", walkingDistance.getText()))));
    }
}
