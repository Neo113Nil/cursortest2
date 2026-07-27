package e5;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4465a {
    private Float accuracy;
    private Boolean bg;
    private Double lat;
    private Double log;
    private Long timeStamp;
    private Integer type;

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Boolean getBg() {
        return this.bg;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLog() {
        return this.log;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setAccuracy(Float f3) {
        this.accuracy = f3;
    }

    public final void setBg(Boolean bool) {
        this.bg = bool;
    }

    public final void setLat(Double d2) {
        this.lat = d2;
    }

    public final void setLog(Double d2) {
        this.log = d2;
    }

    public final void setTimeStamp(Long l9) {
        this.timeStamp = l9;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "LocationPoint{lat=" + this.lat + ", log=" + this.log + ", accuracy=" + this.accuracy + ", type=" + this.type + ", bg=" + this.bg + ", timeStamp=" + this.timeStamp + '}';
    }
}
