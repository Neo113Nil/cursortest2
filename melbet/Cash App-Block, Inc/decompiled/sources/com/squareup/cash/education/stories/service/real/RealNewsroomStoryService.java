package com.squareup.cash.education.stories.service.real;

import com.squareup.cash.education.stories.service.api.EducationStoryService;
import com.squareup.cash.education.stories.service.api.NewsroomStoryService;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes6.dex */
public final class RealNewsroomStoryService implements NewsroomStoryService, EducationStoryService {
    public final NewsroomStoryService delegate;

    public RealNewsroomStoryService(Retrofit retrofit, Moshi moshi) {
        Moshi.Builder newBuilder = moshi.newBuilder();
        newBuilder.add(new IsoDateTimeAdapter());
        Moshi moshi2 = new Moshi(newBuilder);
        Retrofit.Builder builder = new Retrofit.Builder(retrofit);
        builder.baseUrl("https://svr.nws.ai");
        ((ArrayList) builder.converterFactories).add(MoshiConverterFactory.create(moshi2));
        Object create = builder.build().create(NewsroomStoryService.class);
        create.getClass();
        this.delegate = (NewsroomStoryService) create;
    }

    @Override // com.squareup.cash.education.stories.service.api.NewsroomStoryService, com.squareup.cash.education.stories.service.api.EducationStoryService
    public final Object getStories(String str, String str2, Continuation continuation) {
        return this.delegate.getStories(str, str2, continuation);
    }
}
