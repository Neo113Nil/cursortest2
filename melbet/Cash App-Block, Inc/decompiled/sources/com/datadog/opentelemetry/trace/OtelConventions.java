package com.datadog.opentelemetry.trace;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.datadog.android.trace.api.span.DatadogSpan;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ResponseContext;
import com.stripe.android.core.strings.IdentifierResolvableString;
import com.stripe.android.core.strings.ResolvableString;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class OtelConventions {
    public static void applyNamingConvention(DatadogSpan datadogSpan) {
        char c;
        String stringAttribute;
        String stringAttribute2;
        String m;
        if ("internal".equals(datadogSpan.getOperationName())) {
            Object tag = datadogSpan.getTag("span.kind");
            if (tag instanceof String) {
                switch ((String) tag) {
                    case "client":
                        c = 3;
                        break;
                    case "producer":
                        c = 4;
                        break;
                    case "server":
                        c = 2;
                        break;
                    case "consumer":
                        c = 5;
                        break;
                }
                String stringAttribute3 = getStringAttribute(datadogSpan, "http.request.method");
                if (c != 2 && stringAttribute3 != null) {
                    m = "http.server.request";
                } else if (c == 3 || stringAttribute3 == null) {
                    String stringAttribute4 = getStringAttribute(datadogSpan, "db.system");
                    if (c == 3 || stringAttribute4 == null) {
                        stringAttribute = getStringAttribute(datadogSpan, "messaging.system");
                        stringAttribute2 = getStringAttribute(datadogSpan, "messaging.operation");
                        if ((c == 5 && c != 4 && c != 3 && c != 2) || stringAttribute == null || stringAttribute2 == null) {
                            String stringAttribute5 = getStringAttribute(datadogSpan, "rpc.system");
                            if (c == 3 && "aws-api".equals(stringAttribute5)) {
                                String stringAttribute6 = getStringAttribute(datadogSpan, "rpc.service");
                                m = stringAttribute6 == null ? "aws.client.request" : JsonLogicResult$Success$$ExternalSyntheticOutline0.m("aws.", stringAttribute6, ".request");
                            } else if (c == 3 && stringAttribute5 != null) {
                                m = stringAttribute5.concat(".client.request");
                            } else if (c != 2 || stringAttribute5 == null) {
                                String stringAttribute7 = getStringAttribute(datadogSpan, "faas.invoked_provider");
                                String stringAttribute8 = getStringAttribute(datadogSpan, "faas.invoked_name");
                                if (c != 3 || stringAttribute7 == null || stringAttribute8 == null) {
                                    String stringAttribute9 = getStringAttribute(datadogSpan, "faas.trigger");
                                    if (c == 2 && stringAttribute9 != null) {
                                        m = stringAttribute9.concat(".invoke");
                                    } else if (getStringAttribute(datadogSpan, "graphql.operation.type") != null) {
                                        m = "graphql.server.request";
                                    } else {
                                        String stringAttribute10 = getStringAttribute(datadogSpan, "network.protocol.name");
                                        if (c == 2) {
                                            m = stringAttribute10 == null ? "server.request" : stringAttribute10.concat(".server.request");
                                        } else if (c == 3) {
                                            m = stringAttribute10 == null ? "client.request" : stringAttribute10.concat(".client.request");
                                        } else if (c == 1) {
                                            m = "INTERNAL";
                                        } else if (c == 2) {
                                            m = "SERVER";
                                        } else if (c == 3) {
                                            m = "CLIENT";
                                        } else if (c == 4) {
                                            m = "PRODUCER";
                                        } else {
                                            if (c != 5) {
                                                throw null;
                                            }
                                            m = "CONSUMER";
                                        }
                                    }
                                } else {
                                    m = Boxes$$ExternalSyntheticOutline1.m(stringAttribute7, ".", stringAttribute8, ".invoke");
                                }
                            } else {
                                m = stringAttribute5.concat(".server.request");
                            }
                        } else {
                            m = Recorder$$ExternalSyntheticOutline2.m(stringAttribute, ".", stringAttribute2);
                        }
                    } else {
                        m = stringAttribute4.concat(".query");
                    }
                } else {
                    m = "http.client.request";
                }
                datadogSpan.setOperationName(m.toLowerCase(Locale.ROOT));
            }
            c = 1;
            String stringAttribute32 = getStringAttribute(datadogSpan, "http.request.method");
            if (c != 2) {
            }
            if (c == 3) {
            }
            String stringAttribute42 = getStringAttribute(datadogSpan, "db.system");
            if (c == 3) {
            }
            stringAttribute = getStringAttribute(datadogSpan, "messaging.system");
            stringAttribute2 = getStringAttribute(datadogSpan, "messaging.operation");
            if (c == 5) {
            }
            m = Recorder$$ExternalSyntheticOutline2.m(stringAttribute, ".", stringAttribute2);
            datadogSpan.setOperationName(m.toLowerCase(Locale.ROOT));
        }
    }

    public static String getStringAttribute(DatadogSpan datadogSpan, String str) {
        Object tag = datadogSpan.getTag(str);
        if (tag == null) {
            return null;
        }
        return !(tag instanceof String) ? str : (String) tag;
    }

    public static IdentifierResolvableString resolvableString$default(int i, Object[] objArr) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        return new IdentifierResolvableString(i, emptyList, ArraysKt___ArraysKt.toList(objArr));
    }

    public static final Object[] resolveArgs(Context context, List list) {
        context.getClass();
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Object obj : list2) {
            if (obj instanceof ResolvableString) {
                obj = ((ResolvableString) obj).resolve(context);
            }
            arrayList.add(obj);
        }
        return arrayList.toArray(new Object[0]);
    }

    public static final BlockersData startPlasmaClientScenarioFlow(FlowStarter flowStarter, Screen screen, ResponseContext responseContext, String str) {
        screen.getClass();
        responseContext.getClass();
        return FlowStarter.startFlow$default(flowStarter, BlockersData.Flow.CLIENT_SCENARIO, screen, null, ClientScenario.PLASMA, str, null, null, null, null, 980).updateFromResponseContext(responseContext, false);
    }
}
