package com.squareup.cash.clientrouting.routers.treehouse;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda9;
import com.squareup.cash.tax.web.TaxWebAppBridge$$ExternalSyntheticLambda1;
import com.squareup.cash.treehouse.android.broadway.TreehouseScreenFactory;
import com.squareup.cash.treehouse.android.configuration.EndpointType;
import com.squareup.cash.treehouse.android.configuration.RealTreehouseLinkQrCodeProcessor;
import okhttp3.HttpUrl;

/* loaded from: classes6.dex */
public final class TreehouseRouter {
    public final Navigator navigator;
    public final RealTreehouseLinkQrCodeProcessor treehouseLinkQrCodeProcessor;
    public final TreehouseScreenFactory treehouseScreenFactory;

    public TreehouseRouter(TreehouseScreenFactory treehouseScreenFactory, RealTreehouseLinkQrCodeProcessor realTreehouseLinkQrCodeProcessor, Navigator navigator) {
        navigator.getClass();
        this.treehouseScreenFactory = treehouseScreenFactory;
        this.treehouseLinkQrCodeProcessor = realTreehouseLinkQrCodeProcessor;
        this.navigator = navigator;
    }

    public final void route(ClientRoute.TreehouseAppLink treehouseAppLink) {
        String queryParameter;
        treehouseAppLink.getClass();
        HttpUrl httpUrl = BundleKt.toHttpUrl("https://cash.app/");
        String str = treehouseAppLink.link;
        String str2 = treehouseAppLink.f1110app;
        HttpUrl resolve = httpUrl.resolve(str);
        if (resolve != null && (queryParameter = resolve.queryParameter("manifest-url")) != null) {
            RealTreehouseLinkQrCodeProcessor realTreehouseLinkQrCodeProcessor = this.treehouseLinkQrCodeProcessor;
            GpsConfigQueries gpsConfigQueries = realTreehouseLinkQrCodeProcessor.queries;
            EndpointType endpointType = EndpointType.FROM_SERVER;
            Long valueOf = Long.valueOf(realTreehouseLinkQrCodeProcessor.clock.millis());
            gpsConfigQueries.getClass();
            gpsConfigQueries.driver.execute(-2738, "INSERT OR REPLACE\nINTO treehouseAppConfigurations\nVALUES (?, ?, ?, ?)", new OpenSourceKt$$ExternalSyntheticLambda9(str2, queryParameter, valueOf, gpsConfigQueries));
            gpsConfigQueries.notifyQueries(-2738, new TaxWebAppBridge$$ExternalSyntheticLambda1(27));
            HttpUrl.Builder newBuilder = resolve.newBuilder();
            newBuilder.removeAllQueryParameters("manifest-url");
            HttpUrl build = newBuilder.build();
            String substring = build.encodedPath().substring(1);
            String encodedQuery = build.encodedQuery();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                substring = Recorder$$ExternalSyntheticOutline2.m(substring, "?", encodedQuery);
            }
            treehouseAppLink = new ClientRoute.TreehouseAppLink(treehouseAppLink.spec$1, treehouseAppLink.accountIdentifier, str2, substring, treehouseAppLink.deepLinkSpecs$1);
        }
        this.navigator.goTo(TreehouseScreenFactory.create$default(this.treehouseScreenFactory, treehouseAppLink.f1110app, treehouseAppLink.link, 12));
    }

    public final void route(ClientRoute.TreehouseApp treehouseApp) {
        treehouseApp.getClass();
        this.navigator.goTo(TreehouseScreenFactory.create$default(this.treehouseScreenFactory, treehouseApp.f1109app, null, 14));
    }
}
