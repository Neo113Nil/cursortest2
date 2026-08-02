package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.ColorDto;

/* loaded from: classes5.dex */
public final class vdc {
    public static qfc a(ColorDto colorDto) {
        String colorDay = colorDto.getColorDay();
        String colorNight = colorDto.getColorNight();
        String semanticColor = colorDto.getSemanticColor();
        Double alphaDay = colorDto.getAlphaDay();
        Float valueOf = alphaDay != null ? Float.valueOf((float) alphaDay.doubleValue()) : null;
        Double alphaNight = colorDto.getAlphaNight();
        return new qfc(colorDay, colorNight, semanticColor, valueOf, alphaNight != null ? Float.valueOf((float) alphaNight.doubleValue()) : null);
    }
}
