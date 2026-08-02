package defpackage;

import com.yandex.mapkit.BaseMetadata;
import com.yandex.mapkit.GeoObject;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.Time;
import com.yandex.mapkit.annotations.LocalizedPhrase;
import com.yandex.mapkit.annotations.SpeakerPhraseToken;
import com.yandex.mapkit.directions.driving.Action;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.GeoObjectSelectionMetadata;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.mapkit.navigation.automotive.SpeedLimits;
import com.yandex.mapkit.navigation.automotive.UpcomingManoeuvre;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events.RoadEventMetadata;
import com.yandex.mapkit.search.BillboardObjectMetadata;
import com.yandex.mapkit.search.BusinessObjectMetadata;
import com.yandex.mapkit.search.RoutePointMetadata;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.RouteSettings;
import com.yandex.mapkit.transport.masstransit.TravelEstimation;
import com.yandex.mapkit.transport.masstransit.Weight;
import com.yandex.mapkit.uri.UriObjectMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;
import ru.CryptoPro.reprov.x509.CRLDistributionPointsExtension;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;
import ru.yandextaxi.flutter_yandex_mapkit.helper.a;
import ru.yandextaxi.flutter_yandex_mapkit.methods.Metadata;

/* loaded from: classes15.dex */
public abstract class rsq0 {
    public static Map a(BoundingBox boundingBox) {
        return b.i(new Pair("northEast", i(boundingBox.getNorthEast())), new Pair("southWest", i(boundingBox.getSouthWest())));
    }

    public static Map b(CameraPosition cameraPosition) {
        return b.i(new Pair("target", i(cameraPosition.getTarget())), new Pair("zoom", Float.valueOf(cameraPosition.getZoom())), new Pair("azimuth", Float.valueOf(cameraPosition.getAzimuth())), new Pair("tilt", Float.valueOf(cameraPosition.getTilt())));
    }

    public static String c(Enum r1) {
        return r1.name().toLowerCase(Locale.ROOT);
    }

    public static Map d(String str, GeoObject geoObject) {
        Pair pair = new Pair("id", str);
        List<Metadata> g = scc.g(((BillboardObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(BillboardObjectMetadata.class))) != null ? Metadata.BILLBOARD_OBJECT_METADATA : null, ((RoadEventMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(RoadEventMetadata.class))) != null ? Metadata.ROAD_EVENT_METADATA : null, ((GeoObjectSelectionMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(GeoObjectSelectionMetadata.class))) != null ? Metadata.SELECTION_METADATA : null, ((BusinessObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(BusinessObjectMetadata.class))) != null ? Metadata.BUSINESS_OBJECT_METADATA : null, ((RoutePointMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(RoutePointMetadata.class))) != null ? Metadata.ROUTE_POINT_METADATA : null, ((UriObjectMetadata) ((BaseMetadata) geoObject.getMetadataContainer().getItem(UriObjectMetadata.class))) != null ? Metadata.URI_OBJECT_METADATA : null);
        ArrayList arrayList = new ArrayList();
        for (Metadata metadata : g) {
            String c = metadata != null ? c(metadata) : null;
            if (c != null) {
                arrayList.add(c);
            }
        }
        Pair pair2 = new Pair("container", b.i(pair, new Pair("metadatas", arrayList)));
        Pair pair3 = new Pair("name", geoObject.getName());
        Point a = a.a(geoObject);
        return b.i(pair2, pair3, new Pair(IssuingDistributionPointExtension.POINT, a != null ? i(a) : null), new Pair("descriptionText", geoObject.getDescriptionText()));
    }

    public static Map e(LocalizedPhrase localizedPhrase) {
        List<SpeakerPhraseToken> tokens = localizedPhrase.getTokens();
        ArrayList arrayList = new ArrayList(tcc.n(tokens, 10));
        Iterator<T> it = tokens.iterator();
        while (it.hasNext()) {
            arrayList.add(c((SpeakerPhraseToken) it.next()));
        }
        return b.i(new Pair("tokens", arrayList), new Pair("text", localizedPhrase.getText()), new Pair("language", c(localizedPhrase.getLanguage())));
    }

    public static Map f(LocalizedValue localizedValue) {
        return b.i(new Pair("value", Double.valueOf(localizedValue.getValue())), new Pair("text", localizedValue.getText()));
    }

    public static Map g(Location location) {
        return b.i(new Pair("position", b.i(new Pair("lat", Double.valueOf(location.getPosition().getLatitude())), new Pair("lon", Double.valueOf(location.getPosition().getLongitude())))), new Pair("accuracy", location.getAccuracy()), new Pair("altitude", location.getAltitude()), new Pair("altitudeAccuracy", location.getAltitudeAccuracy()), new Pair("heading", location.getHeading()), new Pair("speed", location.getSpeed()), new Pair("absoluteTimestamp", Long.valueOf(location.getAbsoluteTimestamp())), new Pair("relativeTimestamp", Long.valueOf(location.getRelativeTimestamp())));
    }

    public static Map h(List list) {
        List<Route> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (Route route : list2) {
            Weight weight = route.getMetadata().getWeight();
            RouteSettings settings = route.getMetadata().getSettings();
            TravelEstimation estimation = route.getMetadata().getEstimation();
            List<Point> points = route.getGeometry().getPoints();
            ArrayList arrayList2 = new ArrayList(tcc.n(points, 10));
            Iterator<T> it = points.iterator();
            while (it.hasNext()) {
                arrayList2.add(i((Point) it.next()));
            }
            Pair pair = new Pair("geometry", gw00.e(new Pair(CRLDistributionPointsExtension.POINTS, arrayList2)));
            Pair pair2 = new Pair("weight", b.i(new Pair(RemoteBioParameters.TIME, f(weight.getTime())), new Pair("walking_distance", f(weight.getWalkingDistance())), new Pair("transfers_count", Integer.valueOf(weight.getTransfersCount()))));
            Time time = null;
            Pair pair3 = new Pair("settings", b.i(new Pair("avoid_types", settings != null ? settings.getAvoidTypes() : null), new Pair("accept_types", settings != null ? settings.getAcceptTypes() : null)));
            Pair pair4 = new Pair("departure_time", o(estimation != null ? estimation.getDepartureTime() : null));
            if (estimation != null) {
                time = estimation.getArrivalTime();
            }
            arrayList.add(b.i(pair, new Pair(kju0.j, b.i(pair2, pair3, new Pair("estimation", b.i(pair4, new Pair("arrival_time", o(time))))))));
        }
        return gw00.e(new Pair("routes", arrayList));
    }

    public static Map i(Point point) {
        return b.i(new Pair("lat", Double.valueOf(point.getLatitude())), new Pair("lon", Double.valueOf(point.getLongitude())));
    }

    public static Map j(PolylinePosition polylinePosition) {
        return b.i(new Pair("segmentIndex", Integer.valueOf(polylinePosition.getSegmentIndex())), new Pair("segmentPosition", Double.valueOf(polylinePosition.getSegmentPosition())));
    }

    public static Map k(RequestPoint requestPoint) {
        return b.i(new Pair("lat", Double.valueOf(requestPoint.getPoint().getLatitude())), new Pair("lon", Double.valueOf(requestPoint.getPoint().getLongitude())), new Pair("type", c(requestPoint.getType())), new Pair("point_context", requestPoint.getPointContext()));
    }

    public static Map l(RoadEventMetadata roadEventMetadata) {
        Pair pair = new Pair("id", roadEventMetadata.getEventId());
        Pair pair2 = new Pair(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, roadEventMetadata.getDescription());
        List<EventTag> tags = roadEventMetadata.getTags();
        ArrayList arrayList = new ArrayList(tcc.n(tags, 10));
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            arrayList.add(c((EventTag) it.next()));
        }
        return b.i(pair, pair2, new Pair("tags", arrayList), new Pair(RemoteBioParameters.TIME, o(roadEventMetadata.getModificationTime())));
    }

    public static Map m(SpeedLimits speedLimits) {
        return b.i(new Pair("urban", f(speedLimits.getUrban())), new Pair("rural", f(speedLimits.getRural())), new Pair("expressway", f(speedLimits.getExpressway())));
    }

    public static Map n(Subpolyline subpolyline) {
        return b.i(new Pair("begin", j(subpolyline.getBegin())), new Pair("end", j(subpolyline.getEnd())));
    }

    public static Map o(Time time) {
        return b.i(new Pair("value", time != null ? Long.valueOf(time.getValue()) : null), new Pair("tz_offset", time != null ? Integer.valueOf(time.getTzOffset()) : null), new Pair("text", time != null ? time.getText() : null));
    }

    public static Map p(UpcomingManoeuvre upcomingManoeuvre, DrivingRoute drivingRoute) {
        Action action = upcomingManoeuvre.getAnnotation().getAction();
        return b.i(new Pair("annotation", b.i(new Pair("action", action != null ? c(action) : null), new Pair("toponym", upcomingManoeuvre.getAnnotation().getToponym()))), new Pair("position", j(upcomingManoeuvre.getPosition().positionOnRoute(drivingRoute.getRouteId()))), new Pair("routeId", drivingRoute.getRouteId()));
    }

    public static Map q(VisibleRegion visibleRegion) {
        return b.i(new Pair("topLeft", i(visibleRegion.getTopLeft())), new Pair("topRight", i(visibleRegion.getTopRight())), new Pair("bottomLeft", i(visibleRegion.getBottomLeft())), new Pair("bottomRight", i(visibleRegion.getBottomRight())));
    }
}
