package ru.yandex.video.m3.player.impl.utils;

import android.net.Uri;
import defpackage.i3y;
import defpackage.j73;
import defpackage.sls;
import defpackage.w610;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import ru.yandex.video.m3.player.utils.StreamUrlValidator;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/StreamUrlValidatorImpl;", "Lru/yandex/video/m3/player/utils/StreamUrlValidator;", "invalidDomains", "", "", "invalidExtensions", "(Ljava/util/Set;Ljava/util/Set;)V", "isValid", "", "streamUrl", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StreamUrlValidatorImpl implements StreamUrlValidator {
    private static final String regexPattern = "\\.(\\w*)(?:$|\\?)";
    private final Set<String> invalidDomains;
    private final Set<String> invalidExtensions;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final i3y regex$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.utils.StreamUrlValidatorImpl$Companion$regex$2
        @Override // defpackage.sls
        public final Regex invoke() {
            return new Regex("\\.(\\w*)(?:$|\\?)");
        }
    });
    private static final String frontendVh = "frontend.vh.yandex.ru";
    private static final Set<String> defaultInvalidDomains = Collections.singleton(frontendVh);
    private static final Set<String> defaultInvalidExtensions = j73.f0(new String[]{"json", "html", "", null});

    public /* synthetic */ StreamUrlValidatorImpl(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? defaultInvalidDomains : set, (i & 2) != 0 ? defaultInvalidExtensions : set2);
    }

    @Override // ru.yandex.video.m3.player.utils.StreamUrlValidator
    public boolean isValid(String streamUrl) {
        w610 b;
        Uri parse = Uri.parse(streamUrl);
        if (parse == null) {
            return false;
        }
        String host = parse.getHost();
        String encodedPath = parse.getEncodedPath();
        String str = null;
        if (encodedPath != null && (b = Companion.getRegex().b(encodedPath)) != null) {
            str = (String) kotlin.collections.a.Z(b.a());
        }
        return (kotlin.collections.a.G(this.invalidDomains, host) && this.invalidExtensions.contains(str)) ? false : true;
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/StreamUrlValidatorImpl$Companion;", "", "<init>", "()V", "Lkotlin/text/Regex;", "regex$delegate", "Li3y;", "getRegex", "()Lkotlin/text/Regex;", "regex", "", "", "defaultInvalidDomains", "Ljava/util/Set;", "defaultInvalidExtensions", "frontendVh", "Ljava/lang/String;", "regexPattern", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Regex getRegex() {
            return (Regex) StreamUrlValidatorImpl.regex$delegate.getValue();
        }

        private Companion() {
        }
    }

    public StreamUrlValidatorImpl(Set<String> set, Set<String> set2) {
        this.invalidDomains = set;
        this.invalidExtensions = set2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StreamUrlValidatorImpl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
