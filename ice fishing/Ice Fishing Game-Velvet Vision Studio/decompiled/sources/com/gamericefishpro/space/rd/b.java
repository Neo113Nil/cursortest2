package com.gamericefishpro.space.rd;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface b {
    Object getIAMData(String str, String str2, String str3, com.gamericefishpro.space.th.a aVar);

    Object getIAMPreviewData(String str, String str2, com.gamericefishpro.space.th.a aVar);

    Object listInAppMessages(String str, String str2, com.gamericefishpro.space.zb.b bVar, Function0<Long> function0, com.gamericefishpro.space.th.a aVar);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z, com.gamericefishpro.space.th.a aVar);

    Object sendIAMImpression(String str, String str2, String str3, String str4, com.gamericefishpro.space.th.a aVar);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, com.gamericefishpro.space.th.a aVar);
}
